package com.testing;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.testing.mockito.Customer;
import com.testing.mockito.CustomerData;
import com.testing.mockito.CustomerDataProcessor;

public class MociktoTest 
{
	@InjectMocks
	CustomerDataProcessor dataProcessor = new CustomerDataProcessor();
	CustomerData customerData = org.mockito.Mockito.mock(CustomerData.class);
	
	 ArrayList<Customer> customers = new ArrayList<>();
	
	
	 @BeforeAll
	    static void setup(){
	        System.out.println("@BeforeAll executed");
	        
	    }
	     
	    @BeforeEach
	    void setupThis(){
	        System.out.println("@BeforeEach executed");
	    }
	     
	    @Test
	    void testAddition() 
	    {
	        System.out.println("testAddition() executed");
	        Customer customer = new Customer();
	        customer.setAddress("address 1");
	        customer.setAge("23");
	        customer.setId("1");
	        customer.setName("Customer 1");
	        customers.add(customer);
	        when(customerData.getCustomerDataFromDB()).thenReturn(customers);
	        
	        dataProcessor.setCustomerData(customerData);
	        assertThat(dataProcessor.processCustomerData()).isEqualTo("1,Customer 1,address 1,23");
	    }
	     
	   
	     
	    @AfterEach
	    void tearThis(){
	        System.out.println("@AfterEach executed");
	    }
	     
	    @AfterAll
	    static void tear(){
	        System.out.println("@AfterAll executed");
	    }
}
