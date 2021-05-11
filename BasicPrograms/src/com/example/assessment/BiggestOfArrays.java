package com.example.assessment;
import java.util.Scanner;
public class BiggestOfArrays {
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter elements");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(getBiggest(arr));

		}
		public static int getBiggest(int arr[])
		{
			int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(min < arr[i])
				{
					min = arr[i];
				}
			}
			return min;
		}
	}


