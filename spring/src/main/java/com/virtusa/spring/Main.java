  package com.virtusa.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beancon.xml");
		System.out.println("Application context");
		Employee s= (Employee) context.getBean("emp");
		s.display();
	}

}
 