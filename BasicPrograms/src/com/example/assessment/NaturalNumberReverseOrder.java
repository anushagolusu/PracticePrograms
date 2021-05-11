package com.example.assessment;

public class NaturalNumberReverseOrder {
	public static void main(String[] args) {

		System.out.println(getNatural(1,10));
	}

	public static String getNatural(int star, int end) {
		String res = "";
		for (int i = end; i >= star; i--) {
			res += i + ",";
		}
		return res.substring(0, res.length() - 1);
	}
}
