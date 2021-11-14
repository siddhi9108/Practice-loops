package com.siddhi.loops1;

import java.util.Scanner;

public class volwelOrConsonant {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your char: ");
		char ch = ob.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowel");

		} else {
			System.out.println("Consonent");

		}

	}

}
