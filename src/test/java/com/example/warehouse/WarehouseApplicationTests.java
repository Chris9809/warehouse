package com.example.warehouse;

import com.example.warehouse.entity.User;
import com.example.warehouse.entity.Warehouse;
import com.example.warehouse.mapper.UserMapper;
import com.example.warehouse.mapper.WarehouseMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class WarehouseApplicationTests {
//
    //@Test
    //void contextLoads() {
    //}
    //
    @Autowired
    JdbcTemplate template;
    //@Autowired
    //DataSource source;
    /**
     * 使用JdbcTemplate实现对数据库的访问
     */
    @Test
    public void testJdbcTemplate(){
        Long count = template.queryForObject("select count(*) from order_info", Long.class);
        log.info("订单记录数："+count);
        //log.info("数据源类型："+source.getClass());
    }

    @Autowired
    UserMapper userMapper;
    @Autowired
    WarehouseMapper warehouseMapper;

    @Test
    public void testUserMapper(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void testWarehouseMapper(){
        Warehouse warehouse = warehouseMapper.selectWarehouseById(1);
        System.out.println(warehouse);
    }
}
