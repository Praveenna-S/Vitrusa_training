package TeamN1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import N1model.Employee;

public class Collections {
	public static void main(String[] args)
	{
		//EmployeeService empser=new EmployeeService;
		
		List<Employee> list=new ArrayList<Employee>();
		
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("name1");
		emp1.setLastname("lastname1");
		emp1.setEmailId("123@gmail.com");
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("name2");
		emp2.setLastname("lastname2");
		emp2.setEmailId("abc@gmail.com");
		
		list.add(emp1);
		list.add(emp2);
		
		for(Employee e: list)
			System.out.println(e);
		
		
		
	}

}
