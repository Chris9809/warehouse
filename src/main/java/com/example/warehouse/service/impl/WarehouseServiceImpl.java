package com.example.warehouse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.warehouse.mapper.WarehouseMapper;
import com.example.warehouse.entity.Warehouse;
import com.example.warehouse.service.WarehouseService;
import org.springframework.stereotype.Service;

/**
 * (Warehouse)表服务实现类
 *
 * @author yelihu
 * @since 2021-05-21 15:58:34
 */
@Service("warehouseService")
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, Warehouse> implements WarehouseService {

}
