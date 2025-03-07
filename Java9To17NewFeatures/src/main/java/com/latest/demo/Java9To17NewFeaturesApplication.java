package com.latest.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java9To17NewFeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java9To17NewFeaturesApplication.class, args);
		Java9Features new9 = new Java9Features();
		List<String> list = new9.addElements();
		list.forEach(System.out::println);

		String s = new9.sayHello();
		System.out.println(s);
		new9.greeting();
		Java9PrivateMethodsInInterface.wish();

		// var can be used for loca variables and compulsorily we should intialize.
//		var name;//This will results to error.
		var s1 = Java10Features.greet();
		System.out.println(s1);
		
		
		System.out.println("Java 11 features");
		Java11Features.stringMethods();
		Java11Features.predicate();
	}

}
