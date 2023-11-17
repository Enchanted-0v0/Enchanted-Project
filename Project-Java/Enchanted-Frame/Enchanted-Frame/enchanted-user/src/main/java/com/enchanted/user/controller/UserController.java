package com.enchanted.user.controller;

import com.enchanted.bean.Result;
import com.enchanted.user.entity.dto.UserDto;
import com.enchanted.user.entity.req.UserReq;
import com.enchanted.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @PackageName:com.enchanted.user.controller
 * @Author Enchanted
 * @Date 2023/11/13 23:49
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Result addUser(@RequestBody UserReq userReq) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq, userDto);
        return Result.ok(userService.addUser(userDto));
    }

    @DeleteMapping("/deleteUser/{id}")
    public Result deleteUser(@PathVariable Integer id) {
        return Result.ok(userService.deleteUser(id));
    }
}
