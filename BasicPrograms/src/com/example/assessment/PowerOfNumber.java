package com.example.assessment;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value: ");
		int base = sc.nextInt();
		System.out.println("enter the power value: ");
		System.out.println(getPower(base, sc.nextInt()));
	}

	public static int getPower(int num, int power) {
		int res = 1;
		for (int i = 1; i <= power; i++) {
			res = res * num;
		}
		return res;
	}
}
