package com.siddhi.loops1;

import java.util.Scanner;

public class SumOf2Digits {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = ob.nextInt();
		System.out.println("Enter y: ");
		int y = ob.nextInt();
		int sum = x + y;
		if (sum >= 15 && sum <= 20) {
			System.out.println(20);
		} else {
			System.out.println(sum);
		}
	}

}
