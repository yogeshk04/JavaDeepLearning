package com.array;

public class SumOf2DArray {
	public static void main(String[] args) {
		int a[][] = { { 10, 20, 30, 40, 50 }, { 50, 40, 30, 20, 10 }};
		
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				sum += a[i][j];
			}
		}
		System.out.println("Sum of 2D array: " + sum);

	}
}
