package com.siddhi.loops1;

import java.util.Scanner;

public class form2DArray {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int row = ob.nextInt();
		System.out.println("Enter no. of columns: ");
		int col = ob.nextInt();
		int[][] arr = new int[row][col];

		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j <= col - 1; j++) {
				arr[i][j] = i + 1;
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println();
		}
	}

}
