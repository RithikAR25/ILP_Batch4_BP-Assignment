package com.IPL.Batch4.utility;

public class SumOfSerie1 {

	public static void main(String[] args) {
		int input = 19;
		sumOfSeries(input);
	}
	private static void sumOfSeries(int input) {
		int sum = 0;
		int operation_count = 0;
		for (int i = 1; i <= input; i += 2) {
			if (operation_count % 2 == 0) {
				sum += i;
			} else {
				sum -= i;
			}
			operation_count++;
		}
		System.out.println("sum = " + sum);
	}
}
