package com.testing;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CaculatorTestAssertJ 
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
	        assertThat(calculator.add(2, 2)).isEqualTo(4);
	    }
	     
	    @Tag("PROD")
	    @Disabled
	    @Test
	    void testAdditionDisable() 
	    {
	        System.out.println("testAdditionDisable() executed");
	        assertThat(calculator.add(2, 2)).isEqualTo(4);
	    }
	    
	    @Test
	    void  testdivisionException() 
	    {
	    	System.out.println("testdivisionException() executed");
	    	 assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> {
	             calculator.division(2, 0);
	         })
	             .withMessageContaining("/ by zero");
	    }
	    
	    @Test
	    void testEqual() 
	    {
	        System.out.println("testEqual() executed");
	        assertThat( calculator.numberEqual(2, 2)).isTrue();
	    }
	    
	    @Test
	    void testEqualWithFalse() 
	    {
	        System.out.println("testEqualWithFalse() executed");
	        assertThat( calculator.numberEqual(2, 3)).isFalse();
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
