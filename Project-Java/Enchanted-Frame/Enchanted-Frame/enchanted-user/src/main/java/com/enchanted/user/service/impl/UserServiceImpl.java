package com.enchanted.user.service.impl;

import com.enchanted.user.entity.dto.UserDto;
import com.enchanted.user.entity.po.UserPo;
import com.enchanted.user.mapper.UserMapper;
import com.enchanted.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @PackageName:com.enchanted.user.service.impl
 * @Author Enchanted
 * @Date 2023/11/13 23:42
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(UserDto userDto) {
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto, userPo);
        int count = userMapper.insert(userPo);
//        int i = 1/0;
        return count;
    }

    @Override
    public int deleteUser(Integer id) {
        int count = userMapper.deleteById(id);
        return count;
    }
}
