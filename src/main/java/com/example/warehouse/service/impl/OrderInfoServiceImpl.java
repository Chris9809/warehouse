package com.example.warehouse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.warehouse.mapper.OrderInfoMapper;
import com.example.warehouse.entity.OrderInfo;
import com.example.warehouse.service.OrderInfoService;
import org.springframework.stereotype.Service;

/**
 * (OrderInfo)表服务实现类
 *
 * @author yelihu
 * @since 2021-05-21 20:42:34
 */
@Service("orderInfoService")
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
