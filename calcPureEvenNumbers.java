package com.siddhi.loops1;

public class calcPureEvenNumbers {

	public static void main(String[] args) {
		for (int i = 100; i <= 400; i++) {
			if ((i % 10) % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
