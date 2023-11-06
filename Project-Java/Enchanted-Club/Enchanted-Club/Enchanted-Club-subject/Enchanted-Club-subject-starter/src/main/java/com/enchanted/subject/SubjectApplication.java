package com.enchanted.subject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: SubjectApplication
 * @Description: TODO: 刷题微服务启动类
 * @PackageName:com.enchanted.subject
 * @Author Enchanted
 * @Date 2023/11/5 02:47
 * @Version 1.0
 */
@SpringBootApplication
@ComponentScan("com.enchanted")
@MapperScan("com.enchanted.**.mapper")
public class SubjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class, args);
    }
}
