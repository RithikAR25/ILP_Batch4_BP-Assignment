package com.IPL.Batch4.utility;

public class PatternZ {

	public static void main(String[] args) {
		int input = 7;
		PrintPattern(input);

	}

	private static void PrintPattern(int input) {
		for (int i = 1; i <= input; i++) {
			for (int j = input; j >0; j--) {
				
				if(i==1||i==input) {
					if(j%2==0) {
						System.out.print(" " + "#");
					}
					else 
					System.out.print(" " + "*");
				}
				else {
					if(i!=j) {
						
						System.out.print("  ");
					}
					else {
						if(j%2==0) {
							System.out.print(" " + "#");
						}
						else 
						System.out.print(" " + "*");
					}
				}
				
			}
			System.out.println();
		}
	}		
}
