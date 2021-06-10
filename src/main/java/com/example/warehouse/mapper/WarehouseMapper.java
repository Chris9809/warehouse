package com.example.warehouse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.warehouse.entity.Warehouse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * (Warehouse)表数据库访问层
 *
 * @author yelihu
 * @since 2021-05-21 15:58:36
 */
@Mapper
public interface WarehouseMapper extends BaseMapper<Warehouse> {
    public Warehouse selectWarehouseById(@Param("id") int id);
}
