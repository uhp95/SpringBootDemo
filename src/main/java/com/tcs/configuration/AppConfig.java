/**
 * 
 */
package com.tcs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.tcs.service.Customer;
import com.tcs.service.CustomerImpl;
import com.tcs.service.HelloWorld;
import com.tcs.service.HelloWorldImpl;

/**
 * @author springuser05
 *
 */
@Configuration
@Import({CustomerConfiguration.class,HelloWorldConfig.class})
public class AppConfig {
	

	@Bean(name="Customer")
	public Customer Cust()
	{
		return new CustomerImpl();
	}
	
}
