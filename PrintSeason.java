package com.siddhi.loops1;

import java.util.Scanner;

public class PrintSeason {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Month: ");
		String s = ob.next();
		System.out.println("Day: ");
		int x = ob.nextInt();
		String Jan = null;
		if (x == 31) {
			System.out.println("Winter");
		} else {
			System.out.println("Wrong");
		}
	}

}
