package com.example.demo;

@FunctionalInterface
public interface B {
	int  add(int a, int b);
	
	public static int substraction(int a, int b)
	{
		return a-b;
	}
	default int multiplication(int a, int b)
	{
		return a*b;
	}

}
