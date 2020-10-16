package com.employee;
import java.util.Scanner;

public class Avengers 
{
		Scanner sc= new Scanner(System.in);
		public String name,weapon,planet,powers;
		public int age;
		
		public void getDetails() 
		{
			System.out.println("Enter name: ");
			name=sc.nextLine();
			
			System.out.println("Enter age: ");
			age=sc.nextInt();
			
			System.out.println("Enter weapon: ");
			weapon=sc.next();
			
			System.out.println("Enter planet: ");
			planet=sc.next();
			
			System.out.println("Enter powers: ");
			powers=sc.next();
			
		}
		
		public void displayDetails()
		{
			System.out.println("Avenger name is :"+name+" "+"age: "+age+" "+"weapon:"+weapon+" "+"planet: "+planet+" "+"powers: "+powers);
		}

	public static void main(String[] args)
	{
		Avengers[] av=new Avengers[5];
		
		for(int i=0;i<5;i++)
		{
			av[i]=new Avengers();
			av[i].getDetails();
		}
		
		for(int i=0;i<5;i++)
		{
			av[i].displayDetails();
		}
	}
}
