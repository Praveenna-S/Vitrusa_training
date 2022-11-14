package brand1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo {
	public static void main(String[] args)
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigDemo.class);
		Employee emp=ctx.getBean(Employee.class);
		System.out.println("Injected employee value, It can be Autowired: "+emp.getId());
		
		
		Person per=  ctx.getBean(Person.class);
		System.out.println(per.getAddress().streetName);
			
		
		EmployeeService empService=ctx.getBean(EmployeeService.class);
		empService.setMessage("Hello World");
	}

}
