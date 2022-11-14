package brand1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import intf.EmployeeInterface;

@Service
public class EmployeeService {
	@Autowired
EmployeeInterface perEmp;
	@Autowired
EmployeeInterface contrEmp;

public void setMessage(String msg)
{
	perEmp.callEmployee();
	qualifierExample(contrEmp);
	
}

public void qualifierExample(@Qualifier("contrEmp") EmployeeInterface contrEmp)
{
	System.out.println("in method");
	contrEmp.callEmployee();
}

public EmployeeInterface getPerEmp() {
	return perEmp;
}



public void setPerEmp(EmployeeInterface perEmp) {
	this.perEmp = perEmp;
}



public EmployeeInterface getContrEmp() {
	return contrEmp;
}


public void setContrEmp(EmployeeInterface contrEmp) {
	this.contrEmp = contrEmp;
}





}
