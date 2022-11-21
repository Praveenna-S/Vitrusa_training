package com.example.controller;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.model.Order;
import com.example.service.OrderService;
 
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
 
    
 
    /*
     * @GetMapping("/orders") public List<Order> getOrderList() { List<Order>
     * orderList = new ArrayList<>(); orderList = orderService.getAllOrders();
     * 
     * return orderList; }
     */

    @GetMapping("/orders")
    public List<Order> getOrderList(@RequestParam(name="page", defaultValue = "0") int page,

            @RequestParam(name="limit", defaultValue = "2") int limit) {
        List<Order> orderList = new ArrayList<>();
        orderList = orderService.getAllOrders(page,limit);

 
        return    orderList;
    }



}