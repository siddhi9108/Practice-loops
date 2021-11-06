package com.siddhi.loops1;

import java.util.Scanner;

public class countOddEven {

	public static void main(String[] args) {
		int evenCount = 0;
		int oddCount = 0;
		int i;
		int[] arr = new int[5];
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store: ");
		int x = ob.nextInt();
		System.out.println("Enter your numbers: ");
		for (i = 0; i < arr.length; i++) {
			arr[i] = ob.nextInt();
		}
		for (i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Odd Count: " + oddCount);
		System.out.println("Even Count: " + evenCount);
	}

}
