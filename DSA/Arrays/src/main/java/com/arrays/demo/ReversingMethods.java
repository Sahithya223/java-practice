package com.arrays.demo;

public class ReversingMethods {

	// creating temporary array, and coping those elements to the original array.

	public void reversingArrayMethod1(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = arr[n - 1 - i];
		}
		System.out.println(temp);

		// coping elements to the original array.
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}

	// swapping the elements, by using 2 pointers left and right and increasing left
	// by 1 and decreasing right by by 1 after each iteration.

	public void reversingArrayMethodUsing2Pointers(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	// The idea is to iterate over the first half of the array and swap each element
	// with its corresponding element from the end. So, while iterating over the
	// first half, any element at index i is swapped with the element at index (n –
	// i – 1).

	public void reversingArrayMethodIteratingHalfArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}
	}
	
	//using recursion
	public static void reversingArrayUsingRecursion(int[] arr, int l,int r)
	{
		if (l >= r)
            return;
		
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		reversingArrayUsingRecursion(arr, l+1, r-1);
	}
}
