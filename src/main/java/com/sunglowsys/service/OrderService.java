package com.sunglowsys.service;

import com.sunglowsys.domain.Order;

import java.util.List;

public interface OrderService {

    Order save (Order order);

    Order update(Order order,Long id);

    List<Order> findAll();

    Order findbyId(Long id);

    void delete (Long id);

}
