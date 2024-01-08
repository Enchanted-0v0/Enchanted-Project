package com.enchanted.shop.service;

import com.enchanted.shop.request.UserRegisterRequest;
import com.enchanted.shop.utils.JsonData;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @PackageName:com.enchanted.shop.service
 * @Author Enchanted
 * @Date 2024/1/8 12:15
 * @Version 1.0
 */
public interface UserService {
    /**
     * 用户注册
     * @param registerRequest
     * @return
     */
    JsonData register(UserRegisterRequest registerRequest);
}
