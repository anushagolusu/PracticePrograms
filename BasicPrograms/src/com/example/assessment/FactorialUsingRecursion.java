package com.example.assessment;

import java.util.Scanner;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = fact(sc.nextInt());
		System.out.println(a);
	}

	static int fact(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * fact(num - 1);
		}
	}
}
