package com.siddhi.loops1;

import java.util.Scanner;

public class convertStringToLowerCase {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your String: ");
		String s = ob.next();
		// char[] ch = s.toCharArray();
		for (int i = 1; i <= 1; i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				System.out.println(s.toUpperCase());
			} else {
				System.out.println(s.toLowerCase());
			}
		}
		// System.out.println();

	}

}
