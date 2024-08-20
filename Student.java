package com.Codealpha.dto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
{
  ArrayList<Student> std=new ArrayList<Student>();
  Student s1=new Student();
  Scanner sc1=new Scanner(System.in);
  int id=0;
  String name=null;
  double[] marks=new double[5];
  while(true)
  {
	System.out.println("Enter:\n 1.Add Student\n 2.Display All Students\n 3.Exit");
	int choice = sc1.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Enter an Id:");
		id=sc1.nextInt();
		System.out.println("Enter a Name:");
		name=sc1.next();
		System.out.println("Enter 5 subject marks");
		boolean res=true;
		for(int i=0;i<5;i++)
		{
			marks[i]=sc1.nextDouble();
			if(marks[i]>100) 
			{
				System.out.println("Enter valid marks");
				res=false;
				break;
			}		
			
			else
			{
				
					if(marks[i]>90 && marks[i]<=100)
						System.out.println("O");
					else if(marks[i]>80 && marks[i]<=90)
						System.out.println("A");
					else if(marks[i]>70 && marks[i]<=80)
						System.out.println("B");
					else if(marks[i]>60 && marks[i]<=70)
						System.out.println("C");
					else if(marks[i]>50 && marks[i]<=60)
						System.out.println("D");
					else if(marks[i]>=35 && marks[i]<=50)
						System.out.println("E");
					else 
						System.out.println("Fail");
			}
		}
		if(res)
		{
			s1.setSid(id);
			s1.setSname(name);
			s1.setMarks(marks);
			std.add(s1);
			s1.display();
		}
		break;
	case 2:
	{
		for(Student st :std)
		{
			System.out.println(st);
		}
	}
		break;
	case 3:
		System.out.println("Thank you for using my application");
		System.exit(0);
		default:
			System.out.println("Invalid choice....");
	}
}
}
} 
