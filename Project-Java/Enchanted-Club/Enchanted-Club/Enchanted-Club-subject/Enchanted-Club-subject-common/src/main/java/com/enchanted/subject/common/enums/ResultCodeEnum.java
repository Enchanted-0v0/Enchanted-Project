package com.enchanted.subject.common.enums;

import lombok.Getter;

/**
 * @ClassName: ResultCodeEnum
 * @Description: TODO: 请求状态码
 * @PackageName:com.enchanted.subject.common.enums
 * @Author Enchanted
 * @Date 2023/11/9 21:50
 * @Version 1.0
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200, "成功"),
    FAIL(500, "失败");

    public int code;

    public String desc;

    ResultCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ResultCodeEnum getByCode(int codeVal) {
        for (ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()) {
            if (resultCodeEnum.code == codeVal) {
                return resultCodeEnum;
            }
        }
        return null;
    }

}