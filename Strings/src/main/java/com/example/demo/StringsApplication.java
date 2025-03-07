package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
		String a="Hello";
		char c1=a.charAt(1);
		System.out.println(c1);
		String b= a+"World";
		String ab="HelloWorld";
		String d="HelloWorld";
		System.out.println(b);
		System.out.println(b.hashCode()+" "+ab.hashCode());
		System.out.println(b==ab);
		System.out.println(ab==d);
		String c="Hello";
		System.out.println(b.equals(ab));
		System.out.println(a==c);
		
		String e= new String("Hello");
		String f= new String("Hello");
		System.out.println(e==f);//both objects are different. those objects are created in heap memory;
		System.out.println(e);
		
		//String joiners are introduced in java 8
		StringJoiner join= new StringJoiner(",");
		StringJoiner join1= new StringJoiner(":","{","}");
		System.out.println(join);//prints nothing because it is empty;
		join.setEmptyValue("It is empty");
		System.out.println(join);//we are setting empty value for  join and printing that );
		join.add("ABC");
		join.add("XYZ");
		System.out.println(join);//ABC,XYZ one values are added that empty value which have defined will not be there.
		
		//adding values to join1
		join1.add("Parnapalli");
		join1.add("Sahithya");
		System.out.println(join1);//{Parnapalli:Sahithya} this will be the output because we have mentioned prefix and suffix as { };
		
		//we can merge two string joiners as shown below.
		StringJoiner join2= join.merge(join1);
		System.out.println(join2);//ABC,XYZ,Parnapalli:Sahithya this will be the output. it will not include prefix and suffix of second object.
		
		//SrringJoiners are mutable in nature.
		//as in line 45 we have merged Join with Join1. 
	     System.out.println(join);//ABC,XYZ,Parnapalli:Sahithya this will be the output.
	     System.out.println(join1.merge(join));//{Parnapalli:Sahithya:ABC,XYZ,Parnapalli:Sahithya} this will be the output. as we have prefix and suffix for first object we have for this as well.
	     System.out.println(join1);//{Parnapalli:Sahithya:ABC,XYZ,Parnapalli:Sahithya} after merging join1 with join the entire result will store in join1. so we are getting this result.
	     
	     //Optional Class
	     String[] s= new String[10];
//	     System.out.println(s[1].toUpperCase());//this line throws Null pointer exception as there is no value at s[1].
	     //to execute properly without crashing we can use Optional Class.
	     
	     Optional<String> checkValue= Optional.ofNullable(s[1]);
	     if(checkValue.isPresent())
	     {
	    	 System.out.println(s[1].toUpperCase());
	     }
	     else
	    	 System.out.println("No value is present");
	     
		s[2]="sahithya";
		 Optional<String> checkValue1= Optional.ofNullable(s[2]);
		if(checkValue1.isPresent())
		{
			System.out.println(s[2].toUpperCase());
		}
		
		Numbers n= new Numbers();
		n.getNumbers(5);
		Integer a1=10;
		n.getNumbers(a1);
		String intToString= String.valueOf(124);
		System.out.println(intToString);
		System.out.println(intToString.charAt(0));
		System.out.println(Integer.parseInt("124"));
		
		
		//creating string object with the help of new keyword.
		String example=new String("Hello");
		example.concat(" world");
		System.out.println(example);//as String is immutable we will get get ouptut as Hello.
		
		System.out.println("deleting duplicates from given String using streams");
		String s1="welcome";
		String[] arr=s1.split("");
		List<String> l1=Arrays.stream(arr).distinct().collect(Collectors.toList());
		
		for(String s3 : l1)
		{
			System.out.print(s3);
		}
		System.out.println("");
		System.out.println("deleting duplicates from given String using for loops");
		String s2=""+s1.charAt(0);
		for(int i=1; i<s1.length();i++)
		{
			int count=0;
			for(int j=0; j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);

		 String input="AAABBBBCCDEEA";
		 String output="";
		 for(int i=0;i<input.length();i++)
		 {
			 int count =1;
			 char ch=input.charAt(i);
			 for(int j=i+1; j<input.length();j++)
			 {
				 if(ch==input.charAt(j))
				 {
					 count++;
					 i++;
				 }
				 else
				 {
					 break;
				 }
			 }
			 output=output+count+input.charAt(i); 
		 }
		 System.out.println("count number of concurrent occurances of given string "+input);
		 System.out.println(output);

	}

}
