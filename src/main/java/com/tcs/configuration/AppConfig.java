/**
 * 
 */
package com.tcs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tcs.service.Customer;
import com.tcs.service.CustomerImpl;
import com.tcs.service.HelloWorld;
import com.tcs.service.HelloWorldImpl;

/**
 * @author springuser05
 *
 */
@Configuration
public class AppConfig {
	@Bean(name="hello")

	public HelloWorld Hello() 
	{
		return new HelloWorldImpl();
	}

	@Bean(name="Cust")
	public Customer Cust()
	{
		return new CustomerImpl();
	}
	
}
