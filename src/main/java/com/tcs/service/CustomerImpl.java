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
public class CustomerImpl implements Customer{
	
	public String CreateCustomer(String msg)
	{
		System.out.println(msg);
		return msg;
	}
	public String ShowCustomer(String msg)
	{
		System.out.println(msg);
		return msg;
	}
	public String DeleteCustomer(String msg)
	{
		System.out.println(msg);
		return msg;
	}


}
