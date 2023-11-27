package com.enchanted.shop.exception;

import com.enchanted.shop.enums.BizCodeEnum;
import lombok.Data;

/**
 * @ClassName: BizException
 * @Description: TODO: 全局业务异常处理类BizException
 * @PackageName:com.enchanted.shop.exception
 * @Author Enchanted
 * @Date 2023/11/27 22:46
 * @Version 1.0
 */
@Data
public class BizException extends RuntimeException {

    private Integer code;
    private String msg;

    public BizException(Integer code, String message) {
        super(message);
        this.code = code;
        this.msg = message;
    }

    public BizException(BizCodeEnum bizCodeEnum) {
        super(bizCodeEnum.getMessage());
        this.code = bizCodeEnum.getCode();
        this.msg = bizCodeEnum.getMessage();
    }

}