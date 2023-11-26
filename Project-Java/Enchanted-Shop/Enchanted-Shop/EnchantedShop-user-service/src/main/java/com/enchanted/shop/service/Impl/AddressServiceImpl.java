package com.enchanted.shop.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.enchanted.shop.mapper.AddressMapper;
import com.enchanted.shop.model.AddressDO;
import com.enchanted.shop.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AddressServiceImpl
 * @Description: TODO
 * @PackageName:com.enchanted.shop.service.Impl
 * @Author Enchanted
 * @Date 2023/11/26 13:09
 * @Version 1.0
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;
    @Override
    public AddressDO detail(Long id) {

        AddressDO addressDO = addressMapper.selectOne(new QueryWrapper<AddressDO>().eq("id", id));

        return addressDO;
    }
}
