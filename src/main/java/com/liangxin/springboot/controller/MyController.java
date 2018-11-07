package com.liangxin.springboot.controller;

import com.liangxin.springboot.mapper.OrdersMapper;
import com.liangxin.springboot.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private OrdersMapper ordersMapper;
    @RequestMapping("/findOne")
    public Orders findOne(){
        Orders orders = ordersMapper.selectByPrimaryKey(3);
        return orders;
    }
}