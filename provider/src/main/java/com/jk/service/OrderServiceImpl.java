package com.jk.service;

import com.jk.entity.Order;
import com.jk.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> findAll() {
        return orderMapper.findAll();
    }

    @Override
    public void insertOrder(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public void deleteOrder(Integer id) {
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Order hxOrder(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateOrder(Order order) {
        orderMapper.updateByPrimaryKey(order);
    }
}
