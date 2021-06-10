package com.example.warehouse.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.warehouse.controller.base.OrderInfoController;
import com.example.warehouse.entity.OrderInfo;
import com.example.warehouse.service.OrderInfoService;

import com.baomidou.mybatisplus.extension.api.R;

import com.example.warehouse.service.WarehouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * (OrderInfo)控制层扩展类，一般初次生成，后续不再覆盖。这个类提供编写自己定义的方法。
 *
 * @author yelihu
 * @since 2021-05-21 20:42:34
 */
@Controller
@RequestMapping("orderInfo")
public class OrderInfoExtendController extends OrderInfoController {
    @Autowired
    OrderInfoService orderInfoService;
    @Autowired
    WarehouseService warehouseService;

    @PostMapping("add")
    @ResponseBody
    public R<Boolean> add(@RequestBody OrderInfo orderInfo) {
        orderInfo.setInTime(LocalDateTime.now());
        orderInfo.setIsOut(false);
        boolean save = orderInfoService.save(orderInfo);
        if (save) {
            return R.ok(save);
        } else {
            return R.failed("保存出/入库单失败！");
        }
    }

    @PostMapping("out")
    @ResponseBody
    public R<Boolean> out(@RequestParam("oId") int oId) {
        UpdateWrapper<OrderInfo> wrapper = new UpdateWrapper<>();
        wrapper.eq("o_id", oId)
            .set("is_out", true)
            .set("out_time", LocalDateTime.now());

        boolean update = orderInfoService.update(wrapper);
        if (update) {
            return R.ok(update);
        } else {
            return R.failed("出库失败！");
        }
    }
}
