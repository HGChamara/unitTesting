package com.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CaculatorTest 
{
	private static Calculator calculator;
	
	 @BeforeAll
	    static void setup(){
	        System.out.println("@BeforeAll executed");
	        calculator = new Calculator();
	    }
	     
	    @BeforeEach
	    void setupThis(){
	        System.out.println("@BeforeEach executed");
	    }
	     
	    @Test
	    void testAddition() 
	    {
	        System.out.println("testAddition() executed");
	        Assertions.assertEquals( 4 , calculator.add(2, 2));
	    }
	     
	    @Tag("PROD")
	    @Disabled
	    @Test
	    void testAdditionDisable() 
	    {
	        System.out.println("testAdditionDisable() executed");
	        Assertions.assertEquals( 6 , calculator.add(2, 4));
	    }
	    
	    @Test
	    void  testdivisionException() 
	    {
	    	System.out.println("testdivisionException() executed");
	    	Assertions.assertThrows(ArithmeticException.class,
	                ()->{
	                calculator.division(12, 0);
	                });
	    }
	    
	    @Test
	    void testEqual() 
	    {
	        System.out.println("testEqual() executed");
	        Assertions.assertTrue( calculator.numberEqual(2, 2));
	    }
	    
	    @Test
	    void testEqualWithFalse() 
	    {
	        System.out.println("testEqualWithFalse() executed");
	        Assertions.assertFalse( calculator.numberEqual(2, 3));
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
