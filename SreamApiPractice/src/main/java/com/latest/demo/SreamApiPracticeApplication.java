package com.latest.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SreamApiPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SreamApiPracticeApplication.class, args);
		
	List<String> list= new ArrayList<>();
	list.add("apple");
	list.add("Grape");
	list.add("banana");
	list.add("strawberry");
	Map<Integer, List<String>> map=list.stream().collect(Collectors.groupingBy(s->s.length()));
	System.out.println(map);
	
	List<String> list1=Arrays.asList("Hello"," ","World","!");
	String s= list1.stream().collect(Collectors.joining());
	System.out.println(s);
	
	List<Student> students= new ArrayList<>();
	students.add(new Student(1,"shanvi",5,'F'));
	students.add(new Student(2, "vishruth", 6, 'M'));
	students.add(new Student(3, "stray", 4, 'M'));
	
	Map<Character, Long> m1=students.stream().collect(Collectors.groupingBy(st->st.getGender(), Collectors.counting()));
	System.out.println(m1);
	
	double avg=students.stream().collect(Collectors.averagingInt(Student::getAge));
	System.out.println(avg);
	
	OptionalInt opt=IntStream.rangeClosed(1, 100).reduce((a,b)->a+b);
	System.out.println(opt.getAsInt());
	
	String s1="HelloWorld";
	char[] arr=s1.toCharArray();//toCharArray() method will convert string to char[] character array.
	IntStream.range(0, arr.length).mapToObj(a->arr[a]).distinct().forEach(System.out::println);
	
	List<Integer> l1= Arrays.asList(2,3,1,0,4,5,0,9,0,7,0);
	Stream.concat(l1.stream().filter(n->n>0).sorted(), l1.stream().filter(n->n==0)).forEach(System.out::println);
	
	int[] l2= {1,2,3,5};
	int sum1=Arrays.stream(l2).sum();
	int sum2=IntStream.rangeClosed(1, l2.length+1).sum();
	System.out.println(sum1+" "+sum2+" missing number is "+(sum2-sum1));
	
	s1.chars().distinct().mapToObj(i-> (char)i).forEach(System.out::println);
	Map<Object, Long> map1=s1.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i, Collectors.counting()));
	
	System.out.println(map1);
	
	Optional<Student> student=students.stream().min(Comparator.comparing(Student::getAge));
	System.out.println(student.get());
	
	List<Integer> lis=Arrays.asList(1,2,3,4,5,6,7,7,8,8,9,9,9,15);
	List<Integer> lis2=Arrays.asList(10,11,20,10,11,15,19,15,19,18,16,18);
	
	//Filter even numbers from the list.
	System.out.println("even numbers from the lis");
	lis.stream().filter(n->n%2==0).forEach(System.out::println);
	
	System.out.println("Max and min value from lis");
	int max=lis.stream().max(Integer::compare).get();
	System.out.println("max is "+max);
	int min=lis.stream().min(Integer::compare).get();
	System.out.println("max is "+min);
	
	System.out.println("sum of numbers");
	int sum=lis.stream().reduce((a,b)->a+b).get();
	System.out.println("sum of numbers in list is "+sum);
	
	System.out.println("remove duplicates");
	lis.stream().distinct().forEach(System.out::println);
	
	System.out.println("count occurences of element");
	Map<Integer,Long> m=lis.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()));
	System.out.println(m);
	System.out.println("group number of even and odd");
	Map<String, List<Integer>> m2=lis.stream().collect(Collectors.groupingBy(n->n%2==0?"even":"odd"));
	System.out.println(m2);
	
	System.out.println("concatinate all numbers into one string");
	String s3=lis.stream().map(String::valueOf).collect(Collectors.joining(","));
	System.out.println(s3);
	
	System.out.println("top 3 largest numbers");
	List<Integer> l=lis.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).toList();
	System.out.println(l);
	
	System.out.println("remove elements that are divisible by 3 and 5");
	lis.stream().filter(n-> !(n%3==0 && n%5==0)).forEach(System.out::println);
	
	System.out.println("merge 2 lists and remove duplicates");
	Stream.concat(lis.stream(), lis2.stream()).distinct().forEach(System.out::println);

	
	
	List<String> lis1=Arrays.asList("abc","def","ghijk","xyz");
	String s2=lis1.stream().collect(Collectors.joining(","));
	System.out.println(s2);
	lis1.stream().map(e->e.toUpperCase()).forEach(System.out::println);
	
	System.out.println("longest string in the list");
	String s4=lis1.stream().max((n1,n2)->Integer.compare(n1.length(), n2.length())).get();
	String s5=lis1.stream().max(Comparator.comparing(String::length)).get();
	System.out.println(s5);
	System.out.println(s4);
	
	Map<Character,Double> m3=students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
	System.out.println(m3);
	Map<Character,Long> m4=students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
	System.out.println(m4);
	
	List<List<String>> fruits=Arrays.asList(
			Arrays.asList("banana","Grapes","Strawberry"),
			Arrays.asList("papaya","watermelor","muskmelon"),
			Arrays.asList("apple","woodapple","pears","bear"));
	fruits.stream().map(f->f).forEach(System.out::println);
	fruits.stream().filter(f->f.size()>3).forEach(System.out::println);
	fruits.stream().flatMap(f->f.stream()).map(String ::toUpperCase).forEach(System.out::println);
	
	
	
	}

}
