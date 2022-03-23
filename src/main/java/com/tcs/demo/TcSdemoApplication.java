package com.tcs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.tcs.configuration.AppConfig;
import com.tcs.configuration.CustomerConfiguration;
import com.tcs.service.Customer;
import com.tcs.service.HelloWorld;

@SpringBootApplication
@Import({AppConfig.class,CustomerConfiguration.class})
@ComponentScan ("com.tcs.*")
//@EnableAutoConfiguration

public class TcSdemoApplication {

	public static void main(String[] args)/* {
		SpringApplication.run(TcSdemoApplication.class, args);
		
		System.out.println("First Spring App");
		}
		*/
	{
	//ApplicationContext context1 = SpringApplication.run(CustomerConfiguration.class);
	ApplicationContext context = SpringApplication.run(AppConfig.class);
	
	HelloWorld obj = (HelloWorld)context.getBean("hello");
	obj.PrintHelloWorld("I'm in...");
	
	
	Customer obj1 = (Customer) context.getBean("Cust");
	obj1.CreateCustomer("Customer Created");
	obj1.ShowCustomer("Customer Details Displayed");
	obj1.DeleteCustomer("Customer Details Deleted");
	
/*	Customer obj2 = (Customer) context1.getBean("Cust");
	obj2.CreateCustomer("Customer Created");
	obj2.ShowCustomer("Customer Details Displayed");
	obj2.DeleteCustomer("Customer Details Deleted");*/
	
	}
	

}
