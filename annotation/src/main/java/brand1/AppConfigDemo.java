package brand1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
//@ComponentScan(basePackages = {"brand1","intf"})
public class AppConfigDemo {
    //Employee emp;
	Person per;
	
	@Bean
    public Employee employee() {
		Employee emp = new Employee();
        emp.setId(1);
        return emp;
    }    

    @Bean
    public Address address() {
        return new Address();
    }
    
    
    @Bean
    public Person personLoad() {
        per = new Person();
        return per;
    }
}