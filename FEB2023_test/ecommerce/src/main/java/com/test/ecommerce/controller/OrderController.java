package com.test.ecommerce.controller;

import com.test.ecommerce.model.Address;
import com.test.ecommerce.model.Order;
import com.test.ecommerce.model.Product;
import com.test.ecommerce.model.User;
import com.test.ecommerce.repository.AddressRepository;
import com.test.ecommerce.repository.ProductRepository;
import com.test.ecommerce.repository.UserRepository;
import com.test.ecommerce.service.OrderService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/orders")
public class OrderController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    AddressRepository addressRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderService orderService;

    @PostMapping("create-order")
    public String createOrder(@RequestBody String orderRequest){
        JSONObject json = new JSONObject(orderRequest);
        Order order = setOrder(json);
        orderService.createOrder(order);
        return "Order Created";
    }

    private Order setOrder(JSONObject json){
        Order newOrder = new Order();

        newOrder.setId(json.getInt("orderId"));
        newOrder.setProductQuantity(json.getInt("productQuantity"));

        String userId = json.getString("userId");
        User user = userRepository.findById(Integer.valueOf(userId)).get();
        newOrder.setUser(user);

        String productId = json.getString("productId");
        Product product = productRepository.findById(Integer.valueOf(productId)).get();
        newOrder.setProduct(product);

        String addressId = json.getString("addressId");
        Address address = addressRepository.findById(Integer.valueOf(addressId)).get();
        newOrder.setAddress(address);

        return newOrder;
    }

    @GetMapping("get-order-by-id/{orderId}")
    public Order getOrderById(@PathVariable int orderId){
        return orderService.getOrderById(orderId);
    }
}
