package com.enchanted.config;

import com.enchanted.inteceptor.SqlBeautyInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MybatisConfiguration
 * @Description: TODO
 * @PackageName:com.enchanted.config
 * @Author Enchanted
 * @Date 2023/11/14 06:57
 * @Version 1.0
 */
@Configuration
public class MybatisConfiguration {

    @Bean
    @ConditionalOnProperty(name = {"sql.beauty.show"}, havingValue = "true", matchIfMissing = true)
    public SqlBeautyInterceptor sqlBeautyInterceptor() {
        return new SqlBeautyInterceptor();
    }
}
