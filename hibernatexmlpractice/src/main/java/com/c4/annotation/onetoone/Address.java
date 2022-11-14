package com.c4.annotation.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
 
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
 
@Entity
@Table(name = "ADDRESS_1")
public class Address {
 
    @Id
    @Column(name = "emp_id", unique = true, nullable = false)
    @GeneratedValue
    private int id;
 
    @Column(name = "address_line1")
    private String addressLine1;
 
    @Column(name = "zipcode")
    private String zipcode;
 
    @Column(name = "city")
    private String city;
 
    @OneToOne
    @PrimaryKeyJoinColumn
    private Employee employee;
 
    
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getAddressLine1() {
        return addressLine1;
    }
 
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
 
    public String getZipcode() {
        return zipcode;
    }
 
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public Employee getEmployee() {
        return employee;
    }
 
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
 
}