package com.enchanted.subject.applicaiton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: SubjectController
 * @Description: TODO
 * @PackageName:com.enchanted.subject.applicaiton.controller
 * @Author Enchanted
 * @Date 2023/11/5 03:30
 * @Version 1.0
 */
@RestController
public class SubjectController {

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
