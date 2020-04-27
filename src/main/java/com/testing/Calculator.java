package com.testing;

public class Calculator 
{
	public int add(int a, int b) 
	{
		return a+b;
	}
	
	public int substract(int a, int b) 
	{
		return a-b;
	}
	
	public int multiply(int a, int b) 
	{
		return a*b;
	}

	public double division(int a, int b) throws ArithmeticException
	{
		return Double.valueOf(a%b);
	}
	
	public boolean numberEqual(int a, int b) 
	{
		return (a==b)? true: false;
	}
}
