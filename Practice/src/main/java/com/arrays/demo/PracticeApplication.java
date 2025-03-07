package com.arrays.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.model.Student;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) throws CloneNotSupportedException {
		SpringApplication.run(PracticeApplication.class, args);
		LocalDateTime now = LocalDateTime.now();

		System.out.println(now);
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(now.format(formater));
		
		Student s1=new Student(1,"shanvi");
		Student s2=(Student)s1.clone();
		System.out.println(s2);
		
		Swap2Elements swap= new Swap2Elements();
		swap.swapTwoElements(10, 5);
		
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "shanvi");
		map.put(2, "vishruth");
		map.put(3, "stray");
		
		//Iterating map using iterator
		Iterator<Map.Entry<Integer, String>> m= map.entrySet().iterator();
		while(m.hasNext())
		{
			Entry<Integer, String> m1=m.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			
		}
		map.values().stream().forEach(System.out::println);
		map.keySet().stream().forEach(System.out::println);
		map.entrySet().stream().forEach(System.out::println);
		
		List<Integer> arr= Arrays.asList(1,2,3,1,6);
		System.out.println(SumOfElements.balancedSum(arr));
		
		main(10);

		String sentence ="Reverse the big word";
		String[] sArray=sentence.split(" ");
		String bigWord="";
		for(String s: sArray)
		{
			if(s.length()>bigWord.length())
			{
				bigWord=s;
			}
		}
		StringBuilder sb= new StringBuilder(bigWord);
		sb.reverse();
		String newString="";
		for(String s: sArray)
		{
			if(s.equals(bigWord))
			{
				newString=newString+sb.toString()+" ";
			}
			else
				newString=newString+s+" ";
		}
		System.out.println(newString);
		
		System.out.println("printing the duplicate values");
		List<Integer> list1=Arrays.asList(1,0,3,5,0,4,6,7,7,8,8,5);
	Map<Integer,Long> m1=list1.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()));
	int[] arr1=m1.entrySet().stream().filter(m3->m3.getValue()>1).mapToInt(m2->m2.getKey()).toArray();
	for(int i: arr1)
	{
		System.out.println(i);
	}
	}

	public static void main(int a) {
		System.out.println(a);
	}

}
