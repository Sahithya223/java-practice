package com.example.demo;

public class Numbers {

	Numbers()
	{
		System.out.println("Numbers");
	}
	
	public void getNumbers(int a)
	{
		System.out.println("primitive data"+a);
	}
	
	public void getNumbers(Integer a)
	{
		System.out.println("object data"+a);
	}
}
