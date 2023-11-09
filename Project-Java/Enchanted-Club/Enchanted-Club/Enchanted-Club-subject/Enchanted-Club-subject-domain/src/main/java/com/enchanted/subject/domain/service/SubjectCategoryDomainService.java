package com.enchanted.subject.domain.service;

import com.enchanted.subject.domain.entity.SubjectCategoryBO;

/**
 * @ClassName: SubjectCategoryDomainService
 * @Description: TODO
 * @PackageName:com.enchanted.subject.domain.service
 * @Author Enchanted
 * @Date 2023/11/9 20:31
 * @Version 1.0
 */
public interface SubjectCategoryDomainService {

    /**
     * 新增分类
     * BO （Business Object）是一个封装业务逻辑的对象。
     * BO用来在Service层处理业务规则，比如校验、计算、转换等。
     * BO可以包含一个或多个DO对象的信息，也可以不包含DO对象的信息。
     */
    void add(SubjectCategoryBO subjectCategoryBO);
}
