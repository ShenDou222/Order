package com.jk.service;

import com.jk.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();

    void insertOrder(Order order);

    void deleteOrder(Integer id);

    Order hxOrder(Integer id);

    void updateOrder(Order order);
}
