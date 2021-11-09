package com.siddhi.loops1;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {

		Scanner ob = new Scanner(System.in);
		System.out.println("Enter how many numbers you want: ");
		int x = ob.nextInt();
		System.out.println("Numbers: ");
		int[] arr = new int[10];
		for (int i = 0; i <= x; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.print("Your array");
		for (int i = 0; i <= x; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		double median = (arr[(x - 1) / 2] + arr[x / 2]) / 2.0;
		System.out.println(median);

	}
}
