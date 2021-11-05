package com.siddhi.loops1;

import java.util.Scanner;

public class CheckTriangle {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = ob.nextInt();
		System.out.println("Enter y: ");
		int y = ob.nextInt();
		System.out.println("Enter z: ");
		int z = ob.nextInt();

		if (x == y && x == z) {
			System.out.println("Equilateral triangle ");
		} else if (x != y && x != z) {
			System.out.println("Scalene triangle");
		} else {
			System.out.println("Isosceles triangle ");
		}
	}

}
