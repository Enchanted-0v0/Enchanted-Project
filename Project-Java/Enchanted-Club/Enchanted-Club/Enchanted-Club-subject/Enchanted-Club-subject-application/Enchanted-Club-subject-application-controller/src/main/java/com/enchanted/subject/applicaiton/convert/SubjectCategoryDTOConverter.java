package com.enchanted.subject.applicaiton.convert;

import com.enchanted.subject.applicaiton.dto.SubjectCategoryDTO;
import com.enchanted.subject.domain.entity.SubjectCategoryBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @ClassName: SubjectCategoryDTOConverter
 * @Description: TODO:DTO -> BO
 * @PackageName:com.enchanted.subject.applicaiton.convert
 * @Author Enchanted
 * @Date 2023/11/9 22:15
 * @Version 1.0
 */
@Mapper
public interface SubjectCategoryDTOConverter {

    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

    List<SubjectCategoryDTO> convertBoToCategoryDTOList(List<SubjectCategoryBO> subjectCategoryDTO);

    SubjectCategoryBO convertDtoToCategoryBO(SubjectCategoryDTO subjectCategoryDTO);

}
