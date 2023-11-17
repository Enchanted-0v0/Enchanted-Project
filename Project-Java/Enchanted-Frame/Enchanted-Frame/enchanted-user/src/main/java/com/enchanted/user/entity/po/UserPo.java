package com.enchanted.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;
import com.enchanted.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: User
 * @Description: TODO
 * @PackageName:com.enchanted.user.entity.po
 * @Author Enchanted
 * @Date 2023/11/13 22:45
 * @Version 1.0
 */
@TableName("user")
@Data
public class UserPo extends BaseEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private  String name;

    private Integer age;

}
