package com.enchanted.subject.applicaiton.controller;

import com.alibaba.fastjson.JSON;
import com.enchanted.subject.applicaiton.convert.SubjectCategoryDTOConverter;
import com.enchanted.subject.applicaiton.dto.SubjectCategoryDTO;
import com.enchanted.subject.common.entity.Result;
import com.enchanted.subject.domain.entity.SubjectCategoryBO;
import com.enchanted.subject.domain.service.SubjectCategoryDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: SubjectCategoryController
 * @Description: TODO：刷题分类controller
 * @PackageName:com.enchanted.subject.applicaiton.controller
 * @Author Enchanted
 * @Date 2023/11/9 22:22
 * @Version 1.0
 */
@RestController
@RequestMapping("/subject/category")
@Slf4j
public class SubjectCategoryController {
    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;

    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectCategoryDTO subjectCategoryDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectCategoryController.add.dto:{}", JSON.toJSONString(subjectCategoryDTO));
            }
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.convertDtoToCategoryBO(subjectCategoryDTO);
            subjectCategoryDomainService.add(subjectCategoryBO);
            return Result.ok(true);
        }catch (Exception e) {
            return Result.fail();
        }

    }
}
