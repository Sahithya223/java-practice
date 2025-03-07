package com.latest.demo;

public interface Java9PrivateMethodsInInterface {
//	we can create private methods inside an interface that help to share common code between non-abstract methods.
	//priavte method
	private static String sayWishes()
	{
		return "Hello ";
	}
	//default method in interfaces
	   default String sayHello()
	{
		return sayWishes()+"Sahithya";
	}
	   //static method in interfaces
	 public static  void wish()
	 {
		 System.out.println("Hello");
	 }
	void greeting();
}
