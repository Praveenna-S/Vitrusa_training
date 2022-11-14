package brand1;

import org.springframework.stereotype.Component;

import intf.EmployeeInterface;

@Component("contrEmp")
public class ContractEmployee implements EmployeeInterface{
	
	public void callEmployee()
	{
		System.out.println("Contract Employee call function");
	}

}
