package com.arrays.demo;

public class OperationsInUnSortedArray {

	// Linear Search
	public int searchMethod(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}

		}
		return -1;

	}
	
	//Deleting an element from an array
	public int deleteElement(int[] arr, int value)
	{
		int result=searchMethod(arr, value);
		int n=arr.length;
		if(result>0)
		{
			for(int i=result;i<n-1;i++)
			{
				arr[i]=arr[i+1];
			}
			return n-1;
		}
		else {
			System.out.println("element not found");
		}
		return n;
	}
	
	//inserting the element in particular index by shifting elements right side.
	
	public void addingElement(int[] array, int numberOfElementsPresent, int pos,int value)
	{
		int n=numberOfElementsPresent;
			for(int i=n-1;i>=pos;i--)
			{
				array[i+1]=array[i];
			}
			array[pos]=value;
			
	}
}
