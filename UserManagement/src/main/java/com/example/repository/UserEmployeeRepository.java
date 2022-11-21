package com.example.repository;
 
import org.springframework.data.repository.CrudRepository;
 
import com.example.model.UserEmployee;
 
public interface UserEmployeeRepository extends CrudRepository<UserEmployee, Integer> {
 
}