package com.IPL.Batch4.utility;

public class OrderFourNumber {

	public static void main(String[] args) {
		int[] arr = { 7, 10, 5, 3 };
		printOrder(arr);

	}
	private static void printOrder(int[] arr) {
		if (arr[0] < arr[1] && arr[0] < arr[2] && arr[0] < arr[3]) {
			if (arr[1] < arr[2] && arr[1] < arr[3]) {
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			} else if (arr[2] < arr[1] && arr[2] < arr[3]) {
				arr[1] = arr[1] + arr[2];
				arr[2] = arr[1] - arr[2];
				arr[1] = arr[1] - arr[2];
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			} else {
				arr[1] = arr[1] + arr[3];
				arr[3] = arr[1] - arr[3];
				arr[1] = arr[1] - arr[3];
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			}
		} else if (arr[1] < arr[0] && arr[1] < arr[2] && arr[1] < arr[3]) {
			arr[1] = arr[1] + arr[0];
			arr[0] = arr[1] - arr[0];
			arr[1] = arr[1] - arr[0];
			if (arr[1] < arr[2] && arr[1] < arr[3]) {
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			} else if (arr[2] < arr[1] && arr[2] < arr[3]) {
				arr[1] = arr[1] + arr[2];
				arr[2] = arr[1] - arr[2];
				arr[1] = arr[1] - arr[2];
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			} else {
				arr[1] = arr[1] + arr[3];
				arr[3] = arr[1] - arr[3];
				arr[1] = arr[1] - arr[3];
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			}
		}
		else if (arr[2] < arr[0] && arr[2] < arr[1] && arr[2] < arr[3]) {
			arr[2] = arr[2] + arr[0];
			arr[0] = arr[2] - arr[0];
			arr[2] = arr[2] - arr[0];
			if (arr[1] < arr[2] && arr[1] < arr[3]) {
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			} else if (arr[2] < arr[1] && arr[2] < arr[3]) {
				arr[1] = arr[1] + arr[2];
				arr[2] = arr[1] - arr[2];
				arr[1] = arr[1] - arr[2];
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			} else {
				arr[1] = arr[1] + arr[3];
				arr[3] = arr[1] - arr[3];
				arr[1] = arr[1] - arr[3];
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			}
		}
		else {
			arr[3] = arr[3] + arr[0];
			arr[0] = arr[3] - arr[0];
			arr[3] = arr[3] - arr[0];
			if (arr[1] < arr[2] && arr[1] < arr[3]) {
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			} else if (arr[2] < arr[1] && arr[2] < arr[3]) {
				arr[1] = arr[1] + arr[2];
				arr[2] = arr[1] - arr[2];
				arr[1] = arr[1] - arr[2];
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			} else {
				arr[1] = arr[1] + arr[3];
				arr[3] = arr[1] - arr[3];
				arr[1] = arr[1] - arr[3];
				if (arr[3] < arr[2]) {
					arr[2] = arr[2] + arr[3];
					arr[3] = arr[2] - arr[3];
					arr[2] = arr[2] - arr[3];
				}
			}
		}
		System.out.println("Ascending Order : " + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
		System.out.println("Descending Order : " + arr[3] + " " + arr[2] + " " + arr[1] + " " + arr[0]);
	}
}
