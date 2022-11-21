package com.example.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Order;
import com.example.model.Status;
import com.example.model.UserEmployee;
 
@Configuration
public class LoadDatabase {
 
    


    @Bean
      CommandLineRunner initDatabase(UserEmployeeRepository employeeRepository, OrderRepository orderRepository) {
 
        return args -> {
          employeeRepository.save(new UserEmployee(1, "Manisha","s", "Manisha.s@gmail.com"));
          employeeRepository.save(new UserEmployee(2,"Ankita", "B", "Ankita.B@gmail.com"));
 
           employeeRepository.findAll().forEach(employee ->  System.out.println("Preloaded " + employee));
 
          
          orderRepository.save(new Order("MacBook Pro1", Status.COMPLETED));
          orderRepository.save(new Order("iPhone1", Status.IN_PROGRESS));
          orderRepository.save(new Order("MacBook Pro2", Status.COMPLETED));
          orderRepository.save(new Order("iPhone2", Status.IN_PROGRESS));
          orderRepository.save(new Order("MacBook Pro3", Status.COMPLETED));
          orderRepository.save(new Order("iPhone3", Status.IN_PROGRESS));
          orderRepository.save(new Order("MacBook Pro4", Status.COMPLETED));
          orderRepository.save(new Order("iPhone4", Status.IN_PROGRESS));
          orderRepository.save(new Order("MacBook Pro5", Status.COMPLETED));
          orderRepository.save(new Order("iPhone5", Status.IN_PROGRESS));
          orderRepository.save(new Order("MacBook Pro6", Status.COMPLETED));
          orderRepository.save(new Order("iPhone6", Status.IN_PROGRESS));
          orderRepository.save(new Order("MacBook Pro7", Status.COMPLETED));
          orderRepository.save(new Order("iPhone7", Status.IN_PROGRESS));
          orderRepository.save(new Order("MacBook Pro8", Status.COMPLETED));
          orderRepository.save(new Order("iPhone8", Status.IN_PROGRESS));


          orderRepository.findAll().forEach(order -> {
              System.out.println("Preloaded " + order);
          });

        };

    }

}