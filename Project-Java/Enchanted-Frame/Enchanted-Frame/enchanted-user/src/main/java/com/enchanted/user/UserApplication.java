package com.enchanted.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: UserApplication
 * @Description: TODO
 * @PackageName:com.enchanted.user
 * @Author Enchanted
 * @Date 2023/11/13 21:40
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(value = "com.enchanted.*.mapper")
@ComponentScan(value = "com.enchanted")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
