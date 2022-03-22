/**
 * 
 */
package com.tcs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tcs.service.Customer;
import com.tcs.service.CustomerImpl;

/**
 * @author springuser05
 *
 */
@Configuration
public class CustomerConfiguration {
@Bean(name = "Cust")

public Customer Cust()
{
	return new CustomerImpl();
}

}
