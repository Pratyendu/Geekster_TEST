package com.test.ecommerce.service;

import com.test.ecommerce.model.Address;
import com.test.ecommerce.model.Order;
import com.test.ecommerce.model.Product;
import com.test.ecommerce.model.User;
import com.test.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public int createOrder(Order order){
        orderRepository.save(order);
        return order.getId();
    }

    public Order getOrderById(int id){
        return orderRepository.findById(id).get();
    }
}
