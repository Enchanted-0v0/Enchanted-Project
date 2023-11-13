package com.enchanted.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: TODO
 * @PackageName:com.enchanted.user.controller
 * @Author Enchanted
 * @Date 2023/11/13 21:52
 * @Version 1.0
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String test() {
        return "hello world";
    }
}
