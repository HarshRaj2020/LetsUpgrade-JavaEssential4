package com.employee;

public class OddArrayValues 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,2,4,6,9};
		System.out.println("odd values:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		
		}

	}
}
