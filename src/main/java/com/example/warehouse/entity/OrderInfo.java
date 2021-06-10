package com.example.warehouse.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (OrderInfo)表实体类
 *
 * @author yelihu
 * @since 2021-05-21 20:42:34
 */
@Data
@SuppressWarnings("serial")
public class OrderInfo extends Model<OrderInfo> {


    //出入库单编号
    @TableId(value = "o_id",type = IdType.AUTO)
    private Integer oId;


    //货物名称
    private String goodName;


    //货物类型
    private String goodType;


    //货物数量
    private Integer goodNum;


    //货物单价
    private Float goodPrice;


    //出入库单总价
    private Float allPrice;


    //入库时间
    private LocalDateTime inTime;


    //是否出库
    private Boolean isOut;


    //出库时间
    private LocalDateTime outTime;


    //仓库编号
    private Integer whId;

    public OrderInfo() {
    }

    public OrderInfo(Integer oId, Boolean isOut, LocalDateTime outTime) {
        this.oId = oId;
        this.isOut = isOut;
        this.outTime = outTime;
    }
}
