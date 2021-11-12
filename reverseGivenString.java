package com.siddhi.loops1;

import java.util.Scanner;

public class reverseGivenString {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String s = ob.next();
		String ans = " ";
		char[] ch = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			ans += ch[i];
		}
		System.out.println("Reversed Order: " + ans);
	}

}
