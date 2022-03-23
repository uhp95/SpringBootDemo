/**
 * 
 */
package com.tcs.configuration;

import org.springframework.context.annotation.Bean;

import com.tcs.service.HelloWorld;
import com.tcs.service.HelloWorldImpl;

/**
 * @author springuser05
 *
 */
public class HelloWorldConfig {

	@Bean(name="hello")

	public HelloWorld Hello() 
	{
		return new HelloWorldImpl();
	}
}
