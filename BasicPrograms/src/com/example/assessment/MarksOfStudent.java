package com.example.assessment;

public class MarksOfStudent {
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int marks[] = new int[5];
		System.out.println("Enter the  value");
		for(int i=0;i<marks.length;i++)
		{
			marks[i] = sc.nextInt();
		}
		sumOfMarks(marks);
		
	}
	
	public static void sumOfMarks(int marks[])
	{
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		System.out.println("Sum of Marks: "+sum);
	}
}
