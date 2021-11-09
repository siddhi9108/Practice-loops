package com.siddhi.loops1;

public class printAlphabetA {
	void A() {
		int n = 5; // first take n=5
		int row = n; // declare px=row
		int col = n; // declare py=column
		for (int i = 1; i <= 5; i++) // Outer loop for number of rows
		{
			for (int j = 1; j < 10; j++) // Inner loop for number of columns
			{
				if (j == row || j == col || i == n / 2 + 1 && j == 5) // if condition to print the Stars
				{
					System.out.print("*"); // printing stars
				} else {
					System.out.print(" "); // printing white spaces
				}
			}
			row++;
			col--;
			System.out.println();
		}
		System.out.println(); // printing newline after each row
	}

	public static void main(String a[]) {
		printAlphabetA obj = new printAlphabetA(); // Object creation
		obj.A(); // function calling
	}

}
