package com.siddhi.loops1;

public class fizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.println("Fizz");
				continue;
			}
			if (i % 5 == 0) {
				System.out.println("Buzz");
				continue;
			}
			System.out.println(i);
		}
	}

}
