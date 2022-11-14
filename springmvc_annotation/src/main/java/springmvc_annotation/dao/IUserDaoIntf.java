package springmvc_annotation.dao;

import java.util.List;

import springmvc_annotation.model.Employee;

public interface IUserDaoIntf {

	public void saveHib(Employee  emp);
	
	public List<Employee> getEmployees();
}
