package com.IPL.Batch4.utility;

public class SumEqualToK {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 4, 7, 7, 8, 8, 10,5,3,2 };
		int sum = 5;
		System.out.print("The number of pairs of elements in the array whose sum is equal to K : ");
		sumCount(arr,sum);
	}

	private static void sumCount(int[] arr,int sum) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					count++;
				}
			}
		}
		System.out.print(" " + count);
	}

}
