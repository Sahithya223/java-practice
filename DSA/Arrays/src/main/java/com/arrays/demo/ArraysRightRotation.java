package com.arrays.demo;

public class ArraysRightRotation {

	// The approach is simple yet optimized. The idea is to reverse the array three
	// times. For the first time we reverse only the last k elements. Second time we
	// will reverse first n-k(n=size of array) elements. Finally we will get our
	// rotated array by reversing the entire array.
	public static void rightRotationMethod1(int[] arr, int d) {
		int n = arr.length;
		reverseArrayUsingRecursion(arr, n-d, n-1);
		reverseArrayUsingRecursion(arr, 0, n-d-1);
		reverseArrayUsingRecursion(arr, 0, n-1);

	}

	public static void reverseArrayUsingRecursion(int[] arr, int left, int right) {
         
		if(left>=right)
		{
			return;
		}
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		reverseArrayUsingRecursion(arr, left+1, right-1);
	}
}
