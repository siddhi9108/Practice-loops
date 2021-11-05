package com.siddhi.loops1;

import java.util.Scanner;

public class calculateNoOfDigitsAndLetters {

	public static void main(String[] args) {
		int count = 0, count1 = 0;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String s = ob.next();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 96 && ch <= 123) {// small
				count++;
			}
			if (ch >= 64 && ch <= 91) {// capital
				count++;
			}
			if (ch >= 47 && ch <= 58) {// digits from 0 to 9
				count1++;
			}
		}
		System.out.println("Letter: " + count);
		System.out.println("Digits: " + count1);
	}

}
