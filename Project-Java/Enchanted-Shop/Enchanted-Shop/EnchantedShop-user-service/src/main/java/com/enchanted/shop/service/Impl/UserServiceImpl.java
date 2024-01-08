package com.enchanted.shop.service.Impl;

import com.enchanted.shop.enums.BizCodeEnum;
import com.enchanted.shop.enums.SendCodeEnum;
import com.enchanted.shop.mapper.UserMapper;
import com.enchanted.shop.model.UserDO;
import com.enchanted.shop.request.UserRegisterRequest;
import com.enchanted.shop.service.NotifyService;
import com.enchanted.shop.service.UserService;
import com.enchanted.shop.utils.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @PackageName:com.enchanted.shop.service.Impl
 * @Author Enchanted
 * @Date 2024/1/8 12:15
 * @Version 1.0
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private NotifyService notifyService;

    @Autowired
    private UserMapper userMapper;

    /**
     *
     * 用户注册
     * * 邮箱验证码验证
     * * 密码加密（TODO）
     * * 账号唯一性检查(TODO)
     * * 插入数据库
     * * 新注册用户福利发放(TODO)
     *
     * @param registerRequest
     * @return
     */
    @Override
    public JsonData register(UserRegisterRequest registerRequest) {
        boolean checkCode = false;
        //校验验证码
        if(StringUtils.isNotBlank(registerRequest.getMail())){
            checkCode = notifyService.checkCode(SendCodeEnum.USER_REGISTER,registerRequest.getMail(),registerRequest.getCode());
        }

        if(!checkCode){
            return JsonData.buildResult(BizCodeEnum.CODE_ERROR);
        }

        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(registerRequest,userDO);

        userDO.setCreateTime(new Date());
        userDO.setSlogan("人生需要动态规划，学习需要贪心算法");

        //设置密码 TODO
        //userDO.setPwd(registerRequest.getPwd());

        //账号唯一性检查  TODO

        if(checkUnique(userDO.getMail())){
            int rows = userMapper.insert(userDO);
            log.info("rows:{},注册成功:{}",rows,userDO.toString());

            //新用户注册成功，初始化信息，发放福利等 TODO
            userRegisterInitTask(userDO);
            return JsonData.buildSuccess();
        }else {
            return JsonData.buildResult(BizCodeEnum.ACCOUNT_REPEAT);
        }
    }

    /**
     * 校验用户账号唯一
     * @param mail
     * @return
     */
    private boolean checkUnique(String mail) {

        return false;
    }


    /**
     * 用户注册，初始化福利信息 TODO
     * @param userDO
     */
    private void userRegisterInitTask(UserDO userDO){

    }
}
