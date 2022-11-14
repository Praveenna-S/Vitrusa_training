package N1controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import N1model.Employee;
import N1service.EmployeeService;
import N1service.EmployeeServiceImpl;

public class UserLoginController extends HttpServlet {
	
public UserLoginController() 
{}

public void doGet(HttpServletRequest req,HttpServletResponse res)
{
	String deptName=req.getParameter("deptName");
	EmployeeService empser=new EmployeeServiceImpl();
	boolean isCreated= empser.createUser(deptName);
	Employee emp=new Employee();
	req.setAttribute("createUserStatus",emp);;
	

}
}
