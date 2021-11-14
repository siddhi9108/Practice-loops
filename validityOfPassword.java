package com.siddhi.loops1;

import java.util.Scanner;

public class validityOfPassword {

	public static void main(String[] args) {
		int smallCount = 0, capitalCount = 0, digit = 0, specChar = 0, charCount = 0;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String s = ob.next();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch >= 97 && ch <= 122) {// small
				smallCount++;
			}
			if (ch >= 65 && ch <= 90) {// capital
				capitalCount++;
			}
			if (ch >= 48 && ch <= 57) {// digits from 0 to 9
				digit++;
			}
			if (ch >= 32 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 126) {
				specChar++;
			}
			if (s.charAt(i) != ' ') {
				charCount++;
			}
		}
		if (smallCount >= 1 && capitalCount >= 1 && digit >= 1 && specChar >= 1 || charCount >= 6 && charCount <= 16) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid");
		}

	}

}
