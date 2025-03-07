package com.arrays.demo;

public class Duplicates {

	public int removeDuplicates(int[] arr1)
	{
		int j=1;
		for(int i=1;i<arr1.length-1;i++)
		{
			if(arr1[i]!=arr1[i-1])
			{
				arr1[j]=arr1[i];
				j++;
			}
			
		}
		return j;		
	}
}
