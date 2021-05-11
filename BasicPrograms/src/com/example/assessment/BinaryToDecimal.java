package com.example.assessment;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
		int binary = sc.nextInt();
		binaryToDecimal(binary);
		System.out.println("Enter Decimal Number: ");
		int Decimal = sc.nextInt();
		decimalToBinary(Decimal);
		sc.close();
	}

	public static int power(int value, int sqer) {
		long result = 1;
		for (int i = 1; i <= sqer; i++) {
			result *= value;
		}
		return (int) result;
	}

	public static void binaryToDecimal(int binaryNum) {
		int bina = 0;
		int p = 0;
		int rem;
		while (binaryNum != 0) {
			rem = binaryNum % 10;
			binaryNum /= 10;
			bina += rem * power(2, p);
			p++;
		}
		System.out.println(bina);
	}

	public static void decimalToBinary(int decimalNum) {
		String result = "";
		while (decimalNum != 0) {
			int rem = 0;
			rem = decimalNum % 2;
			decimalNum = decimalNum / 2;
			result += rem;
		}
		for (int i = result.length() - 1; i >= 0; i--) {
			System.err.print(result.charAt(i));
		}
	}
}
