package com.IPL.Batch4.utility;

public class SumOfSerie4 {

	public static void main(String[] args) {
		float sum = 0;
		int input = 3;
		sum = sumOfFactorial(input);
		System.out.println("sum = " + sum);
	}
	private static float sumOfFactorial(int n) {
		float sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (float) i / factorial(i);
		}
		return sum;
	}
	private static int factorial(int input) {
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact *= i;
		}
		return fact;
	}
}
