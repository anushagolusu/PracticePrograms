package com.example.assessment;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i : reverse(arr)) {
			System.out.print(i+" ");
		}
	}
	static String getReverse(int arr[])
	{
		String res = "";
		for(int i=arr.length-1;i>=0;i--)
		{
			res += arr[i]+",";
		}
		return res.substring(0,res.length()-1);
	}
	static int[] reverse(int arr[])
	{
		int rev[] = new int[arr.length];
		int j =0;
		for (int i = arr.length-1; i>=0; i--) {
			rev[j] = arr[i];
			j++;
		}
		return rev;
	}
}
