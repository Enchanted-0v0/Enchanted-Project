package com.enchanted.common;

import com.enchanted.bean.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName: ExceptionAdaptController
 * @Description: TODO: 全局异常统一处理
 * @PackageName:com.enchanted.common
 * @Author Enchanted
 * @Date 2023/11/14 07:45
 * @Version 1.0
 */
@RestControllerAdvice
public class ExceptionAdaptController {
    @ExceptionHandler({RuntimeException.class})
    public Result runTimeException(RuntimeException exception){
        exception.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler({Exception.class})
    public Result exception(Exception exception){
        exception.printStackTrace();
        return Result.fail();
    }
}
