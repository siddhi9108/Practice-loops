package com.siddhi.loops1;

public class printNoFromZeroToSix {

	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			if (i == 3 || i == 6) {
				continue;
			}
			System.out.println(i);
		}
	}

}
