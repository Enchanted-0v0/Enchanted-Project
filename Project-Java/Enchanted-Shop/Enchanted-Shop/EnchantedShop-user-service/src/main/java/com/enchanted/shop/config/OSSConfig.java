package com.enchanted.shop.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: OSSConfig
 * @Description: TODO
 * @PackageName:com.enchanted.shop.config
 * @Author Enchanted
 * @Date 2024/1/7 21:10
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "aliyun.oss")
@Configuration
@Data
public class OSSConfig {

    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketname;
}
