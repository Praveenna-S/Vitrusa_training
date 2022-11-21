package com.example.service;
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
 
import com.example.model.Order;
import com.example.model.UserEmployee;
import com.example.repository.OrderRepository;
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
 
    public List<Order> getAllOrders() {
        List<Order> orderList = new ArrayList<Order>();
        orderRepository.findAll().forEach(orderObj -> orderList.add(orderObj));
        return orderList;        
    }
 
    public List<Order> getAllOrders(int page, int limit) {
 
    Pageable     pageable = PageRequest.of(page, limit);
    Page<Order> pageList  = orderRepository.findAll(pageable);
    List<Order> orderList = pageList.getContent();
        return orderList;
    }
 
    
 
}