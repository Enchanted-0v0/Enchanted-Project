package com.enchanted.subject.domain.entity;

import lombok.Data;

/**
 * @ClassName: SubjectCategoryBO
 * @Description: TODO
 * @PackageName:com.enchanted.subject.domain.entity
 * @Author Enchanted
 * @Date 2023/11/9 21:19
 * @Version 1.0
 */
@Data
public class SubjectCategoryBO {

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
