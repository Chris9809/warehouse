package com.example.warehouse.controller.base;

import com.example.warehouse.entity.OrderInfo;
import com.example.warehouse.service.OrderInfoService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.api.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * (OrderInfo)控制层，建议不要修改，如果有新增的方法，在子类中写
 *
 * @author yelihu
 * @since 2021-05-21 20:42:34
 */
public class OrderInfoController {

    @Autowired
    OrderInfoService orderInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page      分页对象
     * @param orderInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    @CrossOrigin
    public R<IPage<OrderInfo>> selectAll(Page<OrderInfo> page, OrderInfo orderInfo) {
        return R.ok(this.orderInfoService.page(page, new QueryWrapper<>(orderInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @CrossOrigin
    public R<OrderInfo> selectOne(@PathVariable Serializable id) {
        return R.ok(this.orderInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param orderInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    @CrossOrigin
    public R<Integer> insert(@RequestBody OrderInfo orderInfo) {
        boolean rs = this.orderInfoService.save(orderInfo);

        return R.ok(rs ? orderInfo.getOId() : 0);
    }

    /**
     * 修改数据
     *
     * @param orderInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    @CrossOrigin
    public R<Integer> update(@RequestBody OrderInfo orderInfo) {
        boolean rs = this.orderInfoService.updateById(orderInfo);
        return R.ok(orderInfo.getOId());
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    @CrossOrigin
    public R<Boolean> delete(@RequestParam("idList") List<Long> idList) {
        return R.ok(this.orderInfoService.removeByIds(idList));
    }
}
