package com.arrays.demo;

public class ArraysLeftRotation {

	// by using 2 loops.
	// here d is the number of rotations.
	public void leftRotationMethod1(int[] arr, int d) {
		for (int i = 0; i < d; i++) {
			int n = arr.length;
			int first = arr[0];
			for (int j = 0; j < n - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[n - 1] = first;
		}
	}

	// The idea is to use a temporary array of size n, where n is the length of the
	// original array. If we left rotate the array by d positions, the last n – d
	// elements will be at the front and the first d elements will be at the end.

//Copy the last (n – d) elements of original array into the first n – d positions of temporary array.
//Then copy the first d elements of the original array to the end of temporary array. 
//Finally, copy all the elements of temporary array back into the original array.

	public void leftRotationMethod2(int[] arr, int d) {
		int n = arr.length;
		int[] temp = new int[n];
		// if d is greater than 1 below if block will handle the condition.
		if (d > n) {
			d = d % n;
		}
		for (int i = 0; i < n - d; i++) {
			temp[i] = arr[d + i];
		}
		for (int i = 0; i < d; i++) {
			temp[n - d + i] = arr[i];
		}
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}

	// using recursion
//	The idea is based on the observation that if we left rotate the array by d positions, the last (n – d) elements will be at the front and the first d elements will be at the end. 
//	Reverse the subarray containing the first d elements of the array.
//	Reverse the subarray containing the last (n – d) elements of the array.
//	Finally, reverse all the elements of the array.
	
	public void rotatingLeftUsingRecursion(int[] arr,int d)
	{
		int n=arr.length;
		reversingUsingRecursion(arr, 0, d-1);
		reversingUsingRecursion(arr, d, n-1);
		reversingUsingRecursion(arr, 0, n-1);
	}
	public static void reversingUsingRecursion(int[] arr, int left, int right)
	{
		if(left>=right)
		{
			return;
		}
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		reversingUsingRecursion(arr, left+1, right-1);
	}
}
