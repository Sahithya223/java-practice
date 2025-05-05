package com.arrays.demo;

public class MissingElementMethods {
	public int missingElementMethod1(int[] arr) {
		int n = arr.length + 1;

		// Create hash array of size n+1
		int[] hash = new int[n + 1];

		// Store frequencies of elements
		for (int i = 0; i < arr.length; i++) {
			hash[arr[i]]++;
		}
		for (int i : hash) {
			System.out.print(i + " ");
		}
		System.out.println("");
		// Find the missing number
		for (int i = 1; i <= n; i++) {
			if (hash[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	// calculating the sum of first n natural numbers and subtracting those array
	// elements from that sum to get the missing element.
	public int missingElementMethod2(int[] arr) {
		int n = arr.length + 1;
		int sum = (n * (n + 1)) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}
		return sum;
	}
}
