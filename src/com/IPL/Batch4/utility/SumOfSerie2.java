package com.IPL.Batch4.utility;

public class SumOfSerie2 {

	public static void main(String[] args) {
		int input = 5;
		sumOfSeries(input);
	}
	private static void sumOfSeries(int input) {
		int sum = 0;
		int previous = 0;
		int current = 1;
		int next = 0;
		boolean flag = true;
		for (int i = 1; i <= input; i=current) {
			next = previous + current;
			previous = current;
			current = next;
			if(i==1 && flag==true) {
				flag = false;
				continue;
			}
			sum = (i*i*i)+ sum;
		}
		System.out.println("sum = " + sum);
	}


}
