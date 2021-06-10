package com.example.warehouse.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Warehouse)表实体类
 *
 * @author yelihu
 * @since 2021-05-21 15:58:29
 */
@Data
@NoArgsConstructor
@SuppressWarnings("serial")
public class Warehouse extends Model<Warehouse> {

    @TableId(value = "wh_id",type = IdType.AUTO)
    //仓库名称
    private Integer whId;


    //仓库名称
    private String whName;


    //仓库地址
    private String whLocal;


    //用户编号（仓库拥有者）
    private Integer ownerId;
}
