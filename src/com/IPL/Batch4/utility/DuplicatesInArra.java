package com.IPL.Batch4.utility;

public class DuplicatesInArra {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 4, 7, 7, 8, 8, 10 };
		System.out.print("Duplicates number in Arra : ");
		findDuplicates(arr);
	}

	private static void findDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(" " + arr[i]);
					break;
				}
			}
		}
	}
}
