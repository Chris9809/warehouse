package com.example.warehouse.controller.base;

import com.example.warehouse.entity.Warehouse;
import com.example.warehouse.service.WarehouseService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.api.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * (Warehouse)控制层，建议不要修改，如果有新增的方法，在子类中写
 *
 * @author yelihu
 * @since 2021-05-21 15:58:32
 */
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    /**
     * 分页查询所有数据
     *
     * @param page      分页对象
     * @param warehouse 查询实体
     * @return 所有数据
     */
    @GetMapping
    @CrossOrigin
    public R<IPage<Warehouse>> selectAll(Page<Warehouse> page, Warehouse warehouse) {
        return R.ok(this.warehouseService.page(page, new QueryWrapper<>(warehouse)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @CrossOrigin
    public R<Warehouse> selectOne(@PathVariable Serializable id) {
        return R.ok(this.warehouseService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param warehouse 实体对象
     * @return 新增结果
     */
    @PostMapping
    @CrossOrigin
    public R<Integer> insert(@RequestBody Warehouse warehouse) {
        boolean rs = this.warehouseService.save(warehouse);

        return R.ok(rs ? warehouse.getWhId() : 0);
    }

    /**
     * 修改数据
     *
     * @param warehouse 实体对象
     * @return 修改结果
     */
    @PutMapping
    @CrossOrigin
    public R<Integer> update(@RequestBody Warehouse warehouse) {
        boolean rs = this.warehouseService.updateById(warehouse);
        return R.ok(warehouse.getWhId());
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
        return R.ok(this.warehouseService.removeByIds(idList));
    }
}
