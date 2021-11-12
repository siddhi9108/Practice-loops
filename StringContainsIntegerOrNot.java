package com.siddhi.loops1;

import java.util.Scanner;

public class StringContainsIntegerOrNot {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String s = ob.next();
		char ch = s.charAt(0);
		if (ch >= 47 && ch <= 58) {
			System.out.println("The string is an integer");
		} else {
			System.out.println("The string is not an integer");
		}

	}
}
