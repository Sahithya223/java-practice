package com.example.demo;

public class Validation {

	public String validate(int age)
	{
		
		try{
			if(age<18)
			{
				throw new InValidAge(age + " not a valid age");
				
			}
			else
				return age+" Valid";
		}
		catch (InValidAge e) {
			// TODO: handle exception
			return e.getMessage();
		}
		
	}
}
