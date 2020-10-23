package com.jk.service;

import com.jk.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider")
public interface OrderService {

    @RequestMapping("findAll")
    public List<Order> findAll();

    @RequestMapping("insertOrder")
    public void insertOrder(@RequestBody Order order);

    @RequestMapping("deleteOrder")
    public void deleteOrder(@RequestParam Integer id);

    @RequestMapping("hxOrder")
    public Order hxOrder(@RequestParam Integer id);

    @RequestMapping("updateOrder")
    public void updateOrder(@RequestBody Order order);

}
