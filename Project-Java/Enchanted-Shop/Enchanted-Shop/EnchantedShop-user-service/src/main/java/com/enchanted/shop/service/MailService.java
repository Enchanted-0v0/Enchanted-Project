package com.enchanted.shop.service;

import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @ClassName: MailService
 * @Description: TODO
 * @PackageName:com.enchanted.shop.service
 * @Author Enchanted
 * @Date 2024/1/6 09:20
 * @Version 1.0
 */
public interface MailService {

    /**
     * 发送邮件
     * @param to
     * @param subject
     * @param content
     */
    void sendMail(String to, String subject, String content);
}
