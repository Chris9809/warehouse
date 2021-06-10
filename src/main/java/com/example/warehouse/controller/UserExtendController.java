package com.example.warehouse.controller;

import com.example.warehouse.controller.base.UserController;
import com.example.warehouse.entity.User;
import com.example.warehouse.service.UserService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.example.warehouse.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * 用户表(User)控制层扩展类，一般初次生成，后续不再覆盖。这个类提供编写自己定义的方法。
 *
 * @author yelihu
 * @since 2021-05-21 18:00:23
 */
@Controller
@RequestMapping("user")
public class UserExtendController extends UserController {
    @Autowired
    WarehouseService warehouseService;
    @Autowired
    UserService userService;

    @PostMapping("login")
    public ModelAndView login(@RequestParam String phone, @RequestParam String password, HttpSession session){
        QueryWrapper<User> wrapper = new QueryWrapper<User>().eq("phone", phone)
                .eq("password", password);
        User user = userService.getOne(wrapper);
        if (user!=null){
            session.setAttribute("curUser",user);
            return new ModelAndView("redirect:/warehouse/list");
        }else {
             return new ModelAndView("");
        }
    }
}
