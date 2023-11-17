package com.enchanted.user.service;

import com.enchanted.user.entity.dto.UserDto;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @PackageName:com.enchanted.user.service
 * @Author Enchanted
 * @Date 2023/11/13 23:36
 * @Version 1.0
 */
public interface UserService {

    int addUser(UserDto userDto);

    int deleteUser(Integer id);
}
