package com.example.assessment;

import java.util.Scanner;

public class CountAndReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int num = sc.nextInt();
		System.out.println("Count of digits are: " + getCount(num));
		System.out.println("Reverse of number:"+ getReverse(num));
	}

	public static int getCount(int num) {
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	public static int getReverse(int num) {
		int rem = 0;
		int rev = 0;
		while (num != 0) {
			rem = num % 10;
			num /= 10;
			rev=(rev*10)+rem;
		}
		return rev;
	}
}
