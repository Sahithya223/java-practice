package com.arrays.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArraysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArraysApplication.class, args);

		ReversingMethods reversing = new ReversingMethods();
		// method1
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Before reversing");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		reversing.reversingArrayMethod1(arr);
		System.out.println("after reversing");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// by using 2 pointers
		int[] arr1 = { 6, 7, 8, 9, 10 };
		System.out.println("Before reversing");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println("");
		reversing.reversingArrayMethodUsing2Pointers(arr1);
		System.out.println("after reversing");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// iterating array only half of it's size.
		int[] arr2 = { 11, 12, 13, 14, 15, 16 };
		System.out.println("Before reversing");
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		reversing.reversingArrayMethodIteratingHalfArray(arr2);
		System.out.println("after reversing");
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// using recursion
		int[] arr3 = { 0, 1, 2, 3, 4 };
		System.out.println("Before reversing");
		for (int i : arr3) {
			System.out.print(i + " ");
		}
		System.out.println("");
		ReversingMethods.reversingArrayUsingRecursion(arr3, 0, arr3.length - 1);
		System.out.println("after reversing");
		for (int i : arr3) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// Arrays left rotation
		System.out.println("Arrays left rotation");
		ArraysLeftRotation leftRotation = new ArraysLeftRotation();

		int[] arr4 = { 1, 2, 3, 4 };
		System.out.println("Before rotation");
		for (int i : arr4) {
			System.out.print(i + " ");
		}
		System.out.println("");
		leftRotation.leftRotationMethod1(arr4, 2);
		System.out.println("after rotation");
		for (int i : arr4) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// using temporary array.
		int[] arr5 = { 1, 2, 3, 4 };
		System.out.println("Before rotation");
		for (int i : arr5) {
			System.out.print(i + " ");
		}
		System.out.println("");
		leftRotation.leftRotationMethod2(arr5, 5);
		System.out.println("after rotation");
		for (int i : arr5) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// using recursion.
		int[] arr6 = { 1, 2, 3, 4 };
		System.out.println("Before rotation");
		for (int i : arr6) {
			System.out.print(i + " ");
		}
		System.out.println("");
		leftRotation.rotatingLeftUsingRecursion(arr6, 2);
		System.out.println("after rotation");
		for (int i : arr6) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// Arrays Right rotation
		ArraysRightRotation rightRotation = new ArraysRightRotation();
		System.out.println("Arrays right rotation");
		int[] arr7 = { 1, 3, 5, 7, 9 };
		System.out.println("Before rotation");
		for (int i : arr7) {
			System.out.print(i + " ");
		}
		System.out.println("");
		ArraysRightRotation.rightRotationMethod1(arr7, 2);
		System.out.println("After rotation");
		for (int i : arr7) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// operations in unsorted array.
		int[] array = { 10, 20, 30, 40, 50, 90, 80 };
		OperationsInUnSortedArray sorted = new OperationsInUnSortedArray();
		int result = sorted.searchMethod(array, 90);
		if (result > 0) {
			System.out.println("Element found at index " + result);
		} else {
			System.out.println("No such element found");
		}

		int n = sorted.deleteElement(array, 90);
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");

		// insertion
		int[] array1 = new int[6];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 40;
		array1[3] = 50;
		array1[4] = 60;
		int n1 = 5;
		sorted.addingElement(array1, n1, 2, 30);
		n1 = n1 + 1;
		for (int i = 0; i < n1; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("");

		System.out.println("Missing element");

		// missing element in an array with in 1 to n number without duplicates.
		MissingElementMethods miss = new MissingElementMethods();
		int[] arrayNumbers = { 2, 3, 5, 6, 1, 9, 8, 7 };
		int missingNumber = miss.missingElementMethod1(arrayNumbers);
		System.out.println(missingNumber);

		int missNumber2 = miss.missingElementMethod2(arrayNumbers);
		System.out.println(missNumber2);

		// finding duplicates in an Array
		DuplicatesInArray duplicates = new DuplicatesInArray();
		int[] arrayNums = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 8, 9, 10 };
		List<Integer> list = duplicates.findDuplicatesMethod1(arrayNums);
		list.forEach(l -> System.out.print(l + " "));
		System.out.println(" ");
		List<Integer> list1 = duplicates.findDuplicatesMethod1(arrayNums);
		list1.forEach(l -> System.out.print(l + " "));
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		
		int[] sum= {9};
		int[] sum1=new int[sum.length+1];
		sum1[0]=1;
		for(int i:sum1)
		{
			System.out.print(i+" ");
		}

	}

}
