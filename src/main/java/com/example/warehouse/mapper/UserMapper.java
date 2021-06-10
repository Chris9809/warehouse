package com.example.warehouse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.warehouse.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表(User)表数据库访问层
 *
 * @author yelihu
 * @since 2021-05-21 18:00:24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
