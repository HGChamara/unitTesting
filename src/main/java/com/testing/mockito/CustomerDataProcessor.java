package com.testing.mockito;

import java.util.ArrayList;

public class CustomerDataProcessor 
{
	private CustomerData customerData;

	public void setCustomerData(CustomerData customerData) 
	{
		this.customerData = customerData;
	}
	
	public String processCustomerData() 
	{
		ArrayList<Customer> customers = customerData.getCustomerDataFromDB();
		return processData(customers);
	}

	public String processData(ArrayList<Customer> customers) 
	{
		StringBuilder sb = new StringBuilder();
		
		for(Customer customer : customers) 
		{
			sb.append(customer.getId()).append(",")
			.append(customer.getName()).append(",")
			.append(customer.getAddress()).append(",")
			.append(customer.getAge());
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	

}
