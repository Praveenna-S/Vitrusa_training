package springmvc_annotation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import springmvc_annotation.model.Employee;

@Service
public interface IUserServiceIntf {

	
	void save(Employee emp);
	 
    List<Employee> getEmployees();

}