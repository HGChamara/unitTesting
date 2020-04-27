package com.testing.mockito;

import java.util.ArrayList;

public class CustomerData 
{
	public ArrayList<Customer> getCustomerDataFromDB()
	{
		// THIS CLASS CONNECTS TO A DB AND WILL GET DATA FROM THE CUSTOMER TABLE
		return new ArrayList<Customer>();
	}

}
