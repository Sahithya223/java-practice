package com.latest.demo;

import java.util.ArrayList;
import java.util.List;

public class Java9Features implements Java9PrivateMethodsInInterface{
//	A collection factory method in Java is a static method that provides a simple way of initializing an immutable Collection<E>.
//	Being immutable, no elements can be added to, removed from, or modified inside the Collection<E> after it is initialized.
	
	public List<String> addElements()
	{
		List<String> immutableList = List.of("Abc", "Def", "Ghi");
//		immutableList.add("xyz");//this line will throw run time exception as the is immutable if we are creating the list in above way.
		
		ArrayList<Integer> list=new ArrayList<>(List.of(1,2,3));//by creating this way we can add elements as well.
		list.add(4);
		list.forEach(l-> System.out.println(l));
		return immutableList;
	}

@Override
public void greeting() {
	System.out.println("Hello world");
	
}
	

}
