/**
 * 
 */
package com.tcs.service;

/**
 * @author springuser05
 *
 */
public class HelloWorldImpl implements HelloWorld {

	public String PrintHelloWorld (String msg)
	{
		System.out.println(msg);
		return msg;
	}
	
}
