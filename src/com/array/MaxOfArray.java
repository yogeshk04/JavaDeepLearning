package com.array;

public class MaxOfArray {
	public static void main(String[] args) {
		int arr[] = { 20, 40, 54, 55, 49 };

		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				// if (max > arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("Max array is: " + max);
	}
}
