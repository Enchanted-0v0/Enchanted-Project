package com.enchanted.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName: EnchantedMetaObjectHandler
 * @Description: TODO: mybatis属性自动填充MetaObjectHandler
 * @PackageName:com.enchanted.handler
 * @Author Enchanted
 * @Date 2023/11/14 00:14
 * @Version 1.0
 */
@Component
public class CustomMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "createBy", String.class, "Summerday");
        this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
        this.strictInsertFill(metaObject, "deleteFlag", Integer.class, 0);
        this.strictInsertFill(metaObject, "version", Integer.class, 0);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updateBy", String.class, "Summerday");
        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
    }
}
