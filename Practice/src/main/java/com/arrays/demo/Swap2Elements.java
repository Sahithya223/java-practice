package com.arrays.demo;

public class Swap2Elements {
	
	public void swapTwoElements(int a, int b)
	{
	   System.out.println("before swap  a="+a+" ,b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap  a="+a+" ,b="+b);
	}

}
