package com.IPL.Batch4.utility;

public class Pattern1A {

	public static void main(String[] args) {
		int input = 5;
		PrintPattern(input);

	}
	
private static void PrintPattern(int rows) {
		
		for (int i = 1; i <= rows; i++) {
			int k='A';
			for (int j = rows - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char)k);
				k++;
			}
			
			
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
