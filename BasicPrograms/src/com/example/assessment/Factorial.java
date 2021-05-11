package com.example.assessment;

public class Factorial {
	public static void main(String[] args) {

		System.out.println(getFactorial(5));

	}

	public static String getFactorial(int num) {
		String res = "";
		int fact = 1;
		while (num >= 1) {
			res += num + "*";
			fact *= num;
			num--;
		}
		return res.substring(0, res.length() - 1) + " = " + fact;
	}
}
