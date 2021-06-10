package com.example.warehouse.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.warehouse.controller.base.WarehouseController;
import com.example.warehouse.entity.OrderInfo;
import com.example.warehouse.entity.Warehouse;
import com.example.warehouse.exception.LoginOutOfDateException;
import com.example.warehouse.service.OrderInfoService;
import com.example.warehouse.service.WarehouseService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * (Warehouse)控制层扩展类，一般初次生成，后续不再覆盖。这个类提供编写自己定义的方法。
 *
 * @author yelihu
 * @since 2021-05-21 15:58:36
 */
@Controller
@RequestMapping("warehouse")
public class WarehouseExtendController extends WarehouseController {

    //DispatcherServlet
    @Autowired
    WarehouseService warehouseService;
    @Autowired
    OrderInfoService orderInfoService;

    @GetMapping("list")
    public ModelAndView list(@RequestParam(required = false) String keyword){
        ModelAndView mav = new ModelAndView("warehouse/list");
        List<Warehouse> list;
        if (keyword!=null){
            list = warehouseService.list(new QueryWrapper<Warehouse>().like("wh_name",keyword));
        }else {
            list = warehouseService.list();
        }
        mav.addObject("list",list);
        return mav;
    }

    @GetMapping("error")
    public String error(@RequestParam("id") int id){
        ////抛出数学错误ArithmeticException
        //boolean b = true;
        //if (b){
        //    throw new LoginOutOfDateException("登录身份过期");
        //}
        return "warehouse/modify";
    }


    @GetMapping("add")
    public String add(){
        return "/warehouse/add";
    }

    @PostMapping("add")
    @ResponseBody
    public R<Boolean> add(@RequestBody Warehouse warehouse){
        //session.getAttribute("curUser");
        warehouse.setOwnerId(1);//默认为1
        boolean save = warehouseService.save(warehouse);
        if (save){
            return R.ok(save);
        }else {
            return R.failed("添加课程失败！");
        }
    }

    @GetMapping("detail")
    public ModelAndView detail(@RequestParam int whId,@RequestParam(required = false) String keyword){
        ModelAndView mav = new ModelAndView("/warehouse/detail");
        List<OrderInfo> list;
        if (keyword!=null){
            QueryWrapper<OrderInfo> orderWrapper = new QueryWrapper<OrderInfo>()
                    .eq("wh_id", whId)
                    .like("good_name",keyword);
            list = orderInfoService.list(orderWrapper);
        }else {
            QueryWrapper<OrderInfo> orderWrapper = new QueryWrapper<OrderInfo>().eq("wh_id", whId);
            list = orderInfoService.list(orderWrapper);
        }

        QueryWrapper<Warehouse> warehouseWrapper = new QueryWrapper<Warehouse>().eq("wh_id", whId);
        Warehouse warehouse = warehouseService.getOne(warehouseWrapper);

        mav.addObject("warehouse",warehouse);
        mav.addObject("list",list);

        return mav;
    }

    @GetMapping("modify")
    public ModelAndView modify(@RequestParam int whId){
        QueryWrapper<Warehouse> wrapper = new QueryWrapper<Warehouse>().eq("wh_id", whId);
        Warehouse warehouse = warehouseService.getOne(wrapper);

        ModelAndView mav = new ModelAndView("/warehouse/modify");
        mav.addObject("warehouse",warehouse);
        return mav;
    }

    @PostMapping("modify")
    @ResponseBody
    public R<Boolean> modify(@RequestBody Warehouse warehouse){
        UpdateWrapper<Warehouse> wrapper = new UpdateWrapper<>();
        wrapper.set("wh_name",warehouse.getWhName())
                .set("wh_local",warehouse.getWhLocal())
                .eq("wh_id",warehouse.getWhId());

        boolean update = warehouseService.update(wrapper);
        if (update){
            return R.ok(update);
        }else {
            return R.failed("更新仓库信息失败！");
        }
    }
}
