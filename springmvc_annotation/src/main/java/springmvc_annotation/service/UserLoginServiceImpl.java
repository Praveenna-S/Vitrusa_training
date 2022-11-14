package springmvc_annotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc_annotation.dao.UserLoginDao;
import springmvc_annotation.model.Employee;

@Service
public class UserLoginServiceImpl implements IUserServiceIntf {
	
@Autowired
UserLoginDao userspringjdbcdao;
@Override
public void save(Employee emp)
{
	
}

@Override
public List<Employee> getEmployees()
{
	List<Employee> list=userspringjdbcdao.getEmployees();
	return list;
}

}
