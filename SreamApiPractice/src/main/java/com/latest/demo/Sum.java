package com.latest.demo;

import java.util.List;

public class Sum {
	
	public static int balancedSum(List<Integer> arr)
	{
		int index=0;
		int sum=0;
		int n=arr.size()-1;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr.get(i);
			if(sum==arr.get(n))
			{
				return i++;
			}
		}
		return index;
	}

}
