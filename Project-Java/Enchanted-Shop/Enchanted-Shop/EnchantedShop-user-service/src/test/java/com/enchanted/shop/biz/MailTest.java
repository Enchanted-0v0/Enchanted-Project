package com.enchanted.shop.biz;

import com.enchanted.shop.UserApplication;
import com.enchanted.shop.component.MailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: MailTest
 * @Description: TODO
 * @PackageName:com.enchanted.shop.biz
 * @Author Enchanted
 * @Date 2024/1/6 09:24
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class)
@Slf4j
public class MailTest {

    @Autowired
    private MailService mailService;


    @Test
    public void testSendMail(){

        mailService.sendMail("summerdayxumeng@qq.com","欢迎来到Enchanted-Shop","哈哈，这个就是内容");
    }

}
