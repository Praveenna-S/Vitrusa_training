package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_DETAIL")
public class Order {
 
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private Status status;
 
    Order() {}
 
      public Order(String description, Status status) {
 
        this.description = description;
        this.status = status;
      }
 
      public Long getId() {
        return this.id;
      }
 
      public String getDescription() {
        return this.description;
      }
 
      public Status getStatus() {
        return this.status;
      }
 
      public void setId(Long id) {
        this.id = id;
      }
 
      public void setDescription(String description) {
        this.description = description;
      }
 
      public void setStatus(Status status) {
        this.status = status;
      }
 



}