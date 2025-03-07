package com.arrays.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArraysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArraysApplication.class, args);
		int[] arr= {3,5,1,9,8,2,4,6,7};
		Arrays.stream(arr).sorted().forEach(System.out::print);
		System.out.print("sorting the array in  ascending order ");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("sorting the array in  descending order ");
		Sorting sorting = new Sorting();
		sorting.bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int[] arr1= {3,5,5,5,1,1,9,8,2,4,6,7};
		Duplicates duplicates=new Duplicates();
		int newSize=duplicates.removeDuplicates(arr1);
		System.out.print("removing duplicates ");
		for(int i=0;i<newSize;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		int[] arr2= {9,1,2,3,4,5};
		Arrays.sort(arr2);
		System.out.println(Arrays.binarySearch(arr2, 	1));
		
		
		//search algorithms
		
		int[] nums= {1,2,3,4,5,6,10,11,12,17,18,20,25,30};
		Search search=new Search();
		int result1=search.linear(nums, 25);
		if(result1>0)
		{
			System.out.println("Element found at index "+result1);
		}
		else {
			System.out.println("No element found");
		}
		
		int result2=search.binary(nums, 25);//sorted array is required. best for larger array.
		if(result2>0)
		{
			System.out.println("Element found at index "+result2);
		}
		else {
			System.out.println("No element found");
		}
	}

}
