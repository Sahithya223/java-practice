package com.arrays.demo;

public class Search {
	public int linear(int[] nums,int target)
	{
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			count++;
			if(nums[i]==target)
			{
				System.out.println(count+" steps");
				return i;
			}
		}
		return -1;
	}
	
	public int binary(int[] nums, int target)
	{
		int left=0;
		int right=nums.length-1;
	
		int count=0;
		while(left<=right)
		{
			count++;
			int mid=(left+right)/2;
			if(nums[mid]==target)
			{
				System.out.println(count+" steps");
				return mid;
			}
			else if(nums[mid]<target)
			{
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}
}
