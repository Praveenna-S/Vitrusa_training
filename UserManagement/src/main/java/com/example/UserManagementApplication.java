package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.example.*"})
public class UserManagementApplication {
	 private static final Logger LOGGER = LogManager.getLogger("com.example.demo");
	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
		LOGGER.info("This is info message");
        LOGGER.warn("This is Warn message");
        LOGGER.error("This is Error.");
	}
	
	
	
	
	
	//%c{1};
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
 
            System.out.println("In command line runner1");
        };

    }


    @Bean
    public CommandLineRunner commandLineRunner2(ApplicationContext ctx) {
        return args -> {
 
            System.out.println("In command line runner2");

            String[] beanStrArray = ctx.getBeanDefinitionNames();

            for(String beanArr : beanStrArray)
            {
                System.out.println("Bean names: "+beanArr);
            }

        };

    }

}
