package com.enchanted.shop.service.Impl;

import com.enchanted.shop.component.MailService;
import com.enchanted.shop.enums.BizCodeEnum;
import com.enchanted.shop.enums.SendCodeEnum;
import com.enchanted.shop.service.NotifyService;
import com.enchanted.shop.utils.CheckUtil;
import com.enchanted.shop.utils.CommonUtil;
import com.enchanted.shop.utils.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * 验证码的标题
     */
    private static final String SUBJECT= "Enchanted-Shop验证码";

    /**
     * 验证码的内容
     */
    private static final String CONTENT= "您的验证码是%s,有效时间是60秒,打死也不要告诉任何人";

    @Override
    public JsonData sendCode(SendCodeEnum sendCodeEnum, String to) {
        if(CheckUtil.isEmail(to)){
            //邮箱验证码
            String code = CommonUtil.getRandomCode(6);
            mailService.sendMail(to,SUBJECT,String.format(CONTENT,code));
            return JsonData.buildSuccess();

        } else if(CheckUtil.isPhone(to)){
            //短信验证码

        }

        return JsonData.buildResult(BizCodeEnum.CODE_TO_ERROR);
    }
}
