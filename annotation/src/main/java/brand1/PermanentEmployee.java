package brand1;

import org.springframework.stereotype.Component;

import intf.EmployeeInterface;

@Component("perEmp")
public class PermanentEmployee implements EmployeeInterface{
	public void callEmployee()
	{
		System.out.println("Permanent Employee call function ");
	}

}
