package com.employee;
import java.util.Scanner;

public class Array_Sum_User
{

	public static void main(String[] args) 
	{
		int n,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no. of elements: ");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter all elements: ");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of all elements: "+sum);
	}

}
