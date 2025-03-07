package com.latest.demo;

public class Java10Features {
//	In JDK 10 and later, you can declare local variables with non-null initializers with the var identifier, which can help you write code that’s easier to read.

//	 that this feature is available only for local variables with the initializer.
	// not valid for method return types and not valid for method parameters.
	public static String greet() {
		var name = "My name is sahithya";
		// the below 2 lines leads to error.
//		var age=null;
//		var num;

		return name;
	}
}
