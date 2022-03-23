/**
 * 
 */
package com.tcs.service;

import org.springframework.stereotype.Component;

/**
 * @author springuser05
 *
 */
@Component
public class HelloWorldImpl implements HelloWorld {

	public String PrintHelloWorld (String msg)
	{
		System.out.println(msg);
		return msg;
	}
	
}
