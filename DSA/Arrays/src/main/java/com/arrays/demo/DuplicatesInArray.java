package com.arrays.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesInArray {
    //using 2 loops.
	public List<Integer> findDuplicatesMethod1(int[] arr)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					if(!list.contains(arr[i]))
					{
						list.add(arr[i]);
					}
					break;
				}
			}
		}
		
		return list;
		
	}
	
	//using Map
	public List<Integer> findDuplicatesMethod2(int[] arr)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		Map<Integer,Integer> map= new HashMap<Integer, Integer>();
		for(int i:arr)
		{
			map.put(i, map.getOrDefault(i,0)+1);
		}
		for(Map.Entry<Integer, Integer> m: map.entrySet())
		{
			if(m.getValue()>1)
			{
				list.add(m.getKey());
			}
		}
		return list;
		
	}
	

}
