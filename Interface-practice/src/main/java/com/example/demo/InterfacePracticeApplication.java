package com.example.demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.C.D;

import ch.qos.logback.classic.ClassicConstants;

@SpringBootApplication
public class InterfacePracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterfacePracticeApplication.class, args);
		// example for anonymous inner class.
		System.out.println("Example for anonymous inner class.");
		A a = new A() {

			@Override
			public void getMessage() {
				System.out.println("Hello World");

			}

		};
		a.getMessage();

		// example for functional interface along with lambda expression.

		B b = (int a1, int b1) -> {
			return a1 + b1;
		};
		int addResult = b.add(3, 4);
		System.out.println(addResult);
		System.out.println("static method example in functional interface");
		int subResult = B.substraction(10, 15);// as subtraction is static method we are accessing that using Interface
												// name.
		System.out.println(subResult);
		System.out.println(" Default and nonstatic method example in functional interface");

		int multiResult = b.multiplication(20, 10);// as multiplication is non static method we are accessing that
													// method using object reference.
		System.out.println(multiResult);

		System.out.println("simplest form of lambda expression");
		B b2 = (i, j) -> i + j; // as there is only one line in body you can remove those curly braces.
		int addResult2 = b2.add(30, -45);
		System.out.println(addResult2);

		// Inner class examples
		System.out.println("Inner class examples");
		C c = new C();
		c.show();

		// non static D inside public class C
		C.D cd = c.new D();
		cd.show();
		
		// static method inside class D
		C.D.show1();

		// static class E inside C and show method is also static.
		C.E.show();

		// non static method inside static class E
		C.E ce = new C.E();
		ce.show1();
		
		//functional interface examples
		System.out.println("Functional interface examples");
		 
		   Predicate<Integer> p1=(value)-> value>25;
		   System.out.println(p1.test(20));//output false
		   
		   Function<Integer, Integer> f1=(value) -> value*101;//first type is input type, second  is return value type
		   System.out.println(f1.apply(22));//output 2222
		   
		   Supplier<Integer> s1=()-> 25;
		   System.out.println(s1.get());//output will be 25
		   Consumer<String> c1=(string)->string.length() ;
		   c1.accept("abc");//no output becoz accept will not return anything return type is void.
		   
	}

}
