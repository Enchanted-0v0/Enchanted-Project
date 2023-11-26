package com.enchanted.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: UserApplication
 * @Description: TODO: EnchantedShop-user-service 主启动类
 * @PackageName:com.enchanted.shop
 * @Author Enchanted
 * @Date 2023/11/26 12:57
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.enchanted.shop.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
