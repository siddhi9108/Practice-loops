package com.siddhi.loops1;

public class Fibonacci {

	public static void main(String[] args) {
		int x = 0, y = 1, z;
		System.out.println(x + "" + y);
		for (int i = 0; i <= 7; i++) {
			z = x + y;
			System.out.println("" + z);
			x = y;
			y = z;
		}
	}

}
