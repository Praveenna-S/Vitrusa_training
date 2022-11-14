package N1service;

import N1db.EmployeeDAOImpl;
import N1model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	public EmployeeServiceImpl() {}
	
	
	public boolean createUser(String deptName)
	{
		EmployeeDAOImpl empdao=new EmployeeDAOImpl();
		boolean isInserted=empdao.insertTableDB();
		 
		return isInserted;
	}
	
	
	public Employee loadUser(String name)
	{
		EmployeeDAOImpl empdaoobj = new EmployeeDAOImpl();
		Employee empObj = empdaoobj.selectFromDB(name);
	}
	

}
