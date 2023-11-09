package com.enchanted.subject.domain.convert;

import com.enchanted.subject.domain.entity.SubjectCategoryBO;
import com.enchanted.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName: SubjectCategoryConverter
 * @Description: TODO: BO -> DTO
 * @PackageName:com.enchanted.subject.domain.convert
 * @Author Enchanted
 * @Date 2023/11/9 21:24
 * @Version 1.0
 */

@Mapper
public interface SubjectCategoryConverter {

    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);
    SubjectCategory convertBOToCategory(SubjectCategoryBO subjectCategoryBO);
}
