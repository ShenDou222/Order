package com.jk.controller;

import com.jk.entity.Order;
import com.jk.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("toAdd")
    public String toAdd(Model model){
        model.addAttribute("selectOrderById",new Order());
        return "insertShow";
    }

    @RequestMapping("index")
    public String index(Model model){
        List<Order> orderList = orderService.findAll();
        model.addAttribute("orderList",orderList);
        return "index";
    }

    @RequestMapping("deleteOrderById")
    public String deleteOrderById(Integer orderId){
        orderService.deleteOrder(orderId);
        return "redirect:index";
    }

    @RequestMapping("saveOrder")
    public String insertOrder(Order order){
        if (order.getOrderId()==null){
            orderService.insertOrder(order);
        }else{
            orderService.updateOrder(order);
        }
        return "redirect:index";
    }

    @RequestMapping("selectOrderById")
    public String hxOrder(Integer orderId,Model model){
        Order order = orderService.hxOrder(orderId);
        model.addAttribute("selectOrderById",order);
        return "insertShow";
    }

}
