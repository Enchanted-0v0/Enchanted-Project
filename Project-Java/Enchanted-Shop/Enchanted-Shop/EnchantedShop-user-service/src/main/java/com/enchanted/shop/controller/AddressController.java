package com.enchanted.shop.controller;


import com.enchanted.shop.exception.BizException;
import com.enchanted.shop.model.AddressDO;
import com.enchanted.shop.service.AddressService;
import com.enchanted.shop.utils.JsonData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 电商-公司收发货地址表 前端控制器
 * </p>
 *
 * @author Enchanted
 * @since 2023-11-26
 */

@Api(tags = "收货地址模块")
@RestController
@RequestMapping("/api/address/v1/")
public class AddressController {

    @Autowired
    private AddressService addressService;


    @ApiOperation("根据id查找地址详情")
    @GetMapping("/find/{address_id}")
    public Object detail(@ApiParam(value = "地址id", required = true)
                         @PathVariable("address_id") Long addressId) {
        AddressDO addressDO = addressService.detail(addressId);
        // 模拟非业务异常 - 除 0 异常
        // int i = 1 / 0;

        // 模拟业务异常
        //if (addressId == 1) {
        //    throw new BizException(-1, "测试自定义异常");
        //}
        return JsonData.buildSuccess(addressDO);
    }
}

