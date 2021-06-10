package com.example.warehouse.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表(User)表实体类
 *
 * @author yelihu
 * @since 2021-05-21 18:00:23
 */
@Data
@NoArgsConstructor
@SuppressWarnings("serial")
public class User extends Model<User> {

    @TableId(type = IdType.AUTO)
    //用户编号
    private Integer id;


    private String phone;


    private String password;
}
