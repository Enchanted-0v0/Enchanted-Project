package com.enchanted.shop.service;

import com.enchanted.shop.enums.SendCodeEnum;
import com.enchanted.shop.utils.JsonData;

/**
 * @ClassName: NotifyService
 * @Description: TODO
 * @PackageName:com.enchanted.shop.service
 * @Author Enchanted
 * @Date 2024/1/7 09:01
 * @Version 1.0
 */
public interface NotifyService {
    JsonData sendCode(SendCodeEnum sendCodeEnum, String to );
}
