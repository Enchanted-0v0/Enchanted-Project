package com.enchanted.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.enchanted.user.entity.po.UserPo;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @PackageName:com.enchanted.user.mapper
 * @Author Enchanted
 * @Date 2023/11/13 22:52
 * @Version 1.0
 */
@Repository
public interface UserMapper extends BaseMapper<UserPo> {
}
