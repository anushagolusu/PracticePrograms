package com.example.assessment;

public class SumOfNaturalNumbers {
public static void main(String[] args) {
		
		System.out.println(sumOfnatural(100));
		
	}
	
	static int sumOfnatural(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		else
		{
			return num + sumOfnatural(num -1);
		}
	}
}
