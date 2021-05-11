package com.example.assessment;

public class PrimeNumberRecursion {
	public static void main(String[] args) {
		System.out.println(getPrime(7,2));
	}
	
	public static boolean getPrime(int num,int i2)
	{
		 if (num <= 2) 
	            return (num == 2) ? true : false; 
	        if (num % num == 0) 
	            return false; 
	        if (num * num > num) 
	            return true; 
	        
	        return getPrime(num, num + 1);
	}
}
