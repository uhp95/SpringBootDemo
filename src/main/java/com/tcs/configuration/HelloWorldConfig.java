/**
 * 
 */
package com.tcs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tcs.service.HelloWorld;
import com.tcs.service.HelloWorldImpl;

/**
 * @author springuser05
 *
 */
@Configuration  //Specifies container that this page needs to be looked out for beans. Not mandatory to mention.
public class HelloWorldConfig {

	@Bean(name="hello")  // Specifies beans to the container.

	public HelloWorld Hello() 
	{
		return new HelloWorldImpl();
	}
}
