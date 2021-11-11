package com.siddhi.loops1;

import java.util.Scanner;

public class Q13Loops {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int x = 0;

		while (x < 1000) {
			System.out.println("Enter numbers: ");
			if (ob.hasNextInt()) {
				x = ob.nextInt();
			}
		}
		// System.out.println(x);
	}

}
