package com.latest.demo;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java11Features {

	// some of methods were added to String util class.
	// isBlank()-checks whether string is empty or contains only white spaces.return type is boolean
	// strip()-will remove whitespacess at begining and ending of the string.
	// repeat(n)-Result is the concatenated string of original string repeated the
	// number of times in the argument.
	// lines()-This method returns a stream of strings, which is a collection of all
	// substrings split by lines.
    //	stripTrailing()-It is used to remove the white-space which is in back of the string
   //	stripLeading()-It is used to remove the white-space which is in-front of the string
	
	public static  void stringMethods()
	{
		String s=" ";
		System.out.println("Using isBlank() method "+s.isBlank()+" "+"using isEmpty() Method "+s.isEmpty());//true and false
		
		String s1="  sahithya  ";
		System.out.println(s1.strip());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		
		String s2="10".repeat(5);
		System.out.println(s2);//1010101010
		
		String str = "Hi\nHello\nNamaste";
		  System.out.print(str.lines().toList());//output will be Hi Hello Namaste
		  System.out.println("");
	}
	
//	A static not method has been added to the Predicate interface. We can use it to negate an existing predicate, much like the negate method:

	public static void predicate()
	{
		List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
		List<String> withoutBlanks = sampleList.stream()
		  .filter(Predicate.not(String::isBlank))
		  .collect(Collectors.toList());
		withoutBlanks.forEach(System.out::println);//Java Kotlin
	}
}
