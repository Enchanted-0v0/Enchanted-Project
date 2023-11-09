package com.enchanted.subject.domain.service.impl;

import com.enchanted.subject.domain.convert.SubjectCategoryConverter;
import com.enchanted.subject.domain.entity.SubjectCategoryBO;
import com.enchanted.subject.domain.service.SubjectCategoryDomainService;
import com.enchanted.subject.infra.basic.entity.SubjectCategory;
import com.enchanted.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: SubjectCategoryDomainServiceImpl
 * @Description: TODO
 * @PackageName:com.enchanted.subject.domain.service.impl
 * @Author Enchanted
 * @Date 2023/11/9 20:31
 * @Version 1.0
 */
@Service
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {

    @Resource
    private SubjectCategoryService subjectCategoryService;


    @Override
    public void add(SubjectCategoryBO subjectCategoryBO) {
        // BO -> DTO
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE.convertBOToCategory(subjectCategoryBO);
        subjectCategoryService.insert(subjectCategory);
    }
}
