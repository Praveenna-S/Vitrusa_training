package com.c4.annotation.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
import org.hibernate.annotations.Cascade;
 
@Entity
@Table(name = "EMPLOYEE_1")
public class Employee {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id;
 
    @Column(name = "emp_name")
    private String name;
 
    @Column(name = "emp_salary")
    private double salary;
 
    @OneToOne(mappedBy = "employee")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Address address;
 
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
}