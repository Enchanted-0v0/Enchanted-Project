package com.enchanted.shop.biz;

import com.enchanted.shop.UserApplication;
import com.enchanted.shop.model.AddressDO;
import com.enchanted.shop.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: AddressTest
 * @Description: TODO: AddressTest 测试类
 * @PackageName:com.enchanted.shop.biz
 * @Author Enchanted
 * @Date 2023/11/28 09:54
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class)
@Slf4j
public class AddressTest {

    @Autowired
    private AddressService addressService;


    @Test
    public void testAddressDetail(){

        // AddressDO addressDO = addressService.detail(1L);
        AddressDO addressDO = addressService.detail(2L);
        log.info(addressDO.toString());

        // 断言：不能为空
        Assert.assertNotNull(addressDO);
    }

}
