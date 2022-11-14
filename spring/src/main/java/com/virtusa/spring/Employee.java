package com.virtusa.spring;

public class Employee {
	private int empid;
	private String empname;
	 
	/*Employee(int empid)
	{
		this.empid=empid;
	}
	Employee(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}*/
public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
void display()
{
	System.out.println("EmployeeId: "+getEmpid()+"\n"+"EmployeeName:  "+getEmpname());
}
}
