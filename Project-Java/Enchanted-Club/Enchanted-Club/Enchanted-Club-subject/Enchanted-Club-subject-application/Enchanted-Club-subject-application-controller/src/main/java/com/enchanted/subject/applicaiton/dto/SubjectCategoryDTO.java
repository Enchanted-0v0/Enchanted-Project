package com.enchanted.subject.applicaiton.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: SubjectCategoryDTO
 * @Description: TODO
 * @PackageName:com.enchanted.subject.applicaiton.dto
 * @Author Enchanted
 * @Date 2023/11/9 22:06
 * @Version 1.0
 */
@Data
public class SubjectCategoryDTO implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类类型
     */
    private Integer categoryType;

    /**
     * 图标连接
     */
    private String imageUrl;

    /**
     * 父级id
     */
    private Long parentId;

}
