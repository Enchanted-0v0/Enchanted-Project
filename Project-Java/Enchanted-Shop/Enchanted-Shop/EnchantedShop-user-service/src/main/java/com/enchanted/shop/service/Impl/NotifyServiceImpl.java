package com.enchanted.shop.service.Impl;

import com.enchanted.shop.component.MailService;
import com.enchanted.shop.constant.CacheKey;
import com.enchanted.shop.enums.BizCodeEnum;
import com.enchanted.shop.enums.SendCodeEnum;
import com.enchanted.shop.service.NotifyService;
import com.enchanted.shop.utils.CheckUtil;
import com.enchanted.shop.utils.CommonUtil;
import com.enchanted.shop.utils.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: NotifyServiceImpl
 * @Description: TODO
 * @PackageName:com.enchanted.shop.service.Impl
 * @Author Enchanted
 * @Date 2024/1/7 09:02
 * @Version 1.0
 */
@Service
@Slf4j
public class NotifyServiceImpl implements NotifyService {


    @Autowired
    private MailService mailService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 验证码的标题
     */
    private static final String SUBJECT= "Enchanted-Shop验证码";

    /**
     * 验证码的内容
     */
    private static final String CONTENT= "您的验证码是%s,有效时间是60秒,打死也不要告诉任何人";


    /**
     * 验证码10分钟有效
     */
    private static final int CODE_EXPIRED = 60 * 1000 * 10;

    /**
     * 前置：判断是否重复发送
     *
     * 1、存储验证码到缓存
     *
     * 2、发送邮箱验证码
     *
     * 后置：存储发送记录
     *
     * @param sendCodeEnum
     * @param to
     * @return
     */
    @Override
    public JsonData sendCode(SendCodeEnum sendCodeEnum, String to) {

        // 格式化缓存key：code:USER_REGISTER:邮箱
        String cacheKey = String.format(CacheKey.CHECK_CODE_KEY,sendCodeEnum.name(),to);

        // 根据key获取value
        String cacheValue = redisTemplate.opsForValue().get(cacheKey);

        // 判断value是否为空。如果不为空，则判断是否时间间隔是否小于60秒，如果小于60s提示重复发送
        if(StringUtils.isNotBlank(cacheValue)){
            // 获取验证码发送的时间戳：value(验证码_时间戳)的时间戳后缀
            long ttl = Long.parseLong(cacheValue.split("_")[1]);
            //当前时间戳-验证码发送时间戳，如果小于60秒，则不给重复发送
            if(CommonUtil.getCurrentTimestamp() - ttl < 1000*60){
                log.info("重复发送验证码,时间间隔:{} 秒",(CommonUtil.getCurrentTimestamp()-ttl)/1000);
                return JsonData.buildResult(BizCodeEnum.CODE_LIMITED);
            }
        }

        //拼接验证码 2322_324243232424324
        String code = CommonUtil.getRandomCode(6);

        String value = code+"_"+CommonUtil.getCurrentTimestamp();

        redisTemplate.opsForValue().set(cacheKey,value,CODE_EXPIRED, TimeUnit.MILLISECONDS);

        if(CheckUtil.isEmail(to)){
            //邮箱验证码
            mailService.sendMail(to,SUBJECT,String.format(CONTENT,code));

            return JsonData.buildSuccess();

        } else if(CheckUtil.isPhone(to)){
            //短信验证码

        }

        return JsonData.buildResult(BizCodeEnum.CODE_TO_ERROR);
    }

    /**
     * 校验验证码
     * @param sendCodeEnum
     * @param to
     * @param code
     * @return
     */
    @Override
    public boolean checkCode(SendCodeEnum sendCodeEnum, String to, String code) {
        String cacheKey = String.format(CacheKey.CHECK_CODE_KEY,sendCodeEnum.name(),to);

        String cacheValue = redisTemplate.opsForValue().get(cacheKey);
        if(StringUtils.isNotBlank(cacheValue)){

            String cacheCode = cacheValue.split("_")[0];
            if(cacheCode.equals(code)){
                //删除验证码
                redisTemplate.delete(cacheKey);
                return true;
            }

        }
        return false;
    }
}
