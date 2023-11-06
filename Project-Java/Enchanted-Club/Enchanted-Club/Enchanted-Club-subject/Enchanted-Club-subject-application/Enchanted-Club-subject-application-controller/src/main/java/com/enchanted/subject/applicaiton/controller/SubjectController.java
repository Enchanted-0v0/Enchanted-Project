package com.enchanted.subject.applicaiton.controller;

import com.enchanted.subject.infra.basic.entity.SubjectCategory;
import com.enchanted.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @GetMapping("/test")
    public String test() {
        SubjectCategory subjectCategory = subjectCategoryService.queryById(1L);
        return subjectCategory.getCategoryName();
    }
}
