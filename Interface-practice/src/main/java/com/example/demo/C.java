package com.example.demo;

public class C {
	
	public void show()
	{
		System.out.println("show in class C");
	}
	
	class D{
		
		public void show()
		{
			System.out.println("non static show in class D");
		}
		public static  void show1()
		{
			System.out.println("static show1 in class D");
		}
	}
	static class E{
		public static void show()
		{
			System.out.println("show in class E");
		}
		public  void show1()
		{
			System.out.println("non static show1 in class E");
		}
	}

}
