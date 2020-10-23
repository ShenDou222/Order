package com.jk.controller;

import com.jk.entity.Order;
import com.jk.service.OrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class orderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("findAll")
    public List<Order> findAll(){
        return orderService.findAll();
    }

    @RequestMapping("insertOrder")
    public void insertOrder(@RequestBody Order order){
        orderService.insertOrder(order);
    }

    @RequestMapping("deleteOrder")
    public void deleteOrder(@RequestParam Integer id){
        orderService.deleteOrder(id);
    }

    @RequestMapping("hxOrder")
    public Order hxOrder(@RequestParam Integer id){
        return orderService.hxOrder(id);
    }

    @RequestMapping("updateOrder")
    public void updateOrder(@RequestBody Order order){
        orderService.updateOrder(order);
    }

}
