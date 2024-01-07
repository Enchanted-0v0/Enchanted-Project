package com.enchanted.shop.component.impl;

import com.enchanted.shop.component.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @ClassName: MailServiceImpl
 * @Description: TODO
 * @PackageName:com.enchanted.shop.service.Impl
 * @Author Enchanted
 * @Date 2024/1/6 09:21
 * @Version 1.0
 */
@Service
@Slf4j
public class MailServiceImpl implements MailService {

    /**
     * Spring Boot 提供了一个发送邮件的简单抽象，直接注入即可使用
     */
    @Autowired
    private JavaMailSender mailSender;

    /**
     * 配置文件中的发送邮箱
     */
    @Value("${spring.mail.from}")
    private String from;


    @Override
    public void sendMail(String to, String subject, String content) {
        //创建SimpleMailMessage对象
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件发送人
        message.setFrom(from);
        //邮件接收人
        message.setTo(to);
        //邮件主题
        message.setSubject(subject);
        //邮件内容
        message.setText(content);
        //发送邮件
        mailSender.send(message);
        log.info("邮件发成功:{}",message.toString());
    }
}
