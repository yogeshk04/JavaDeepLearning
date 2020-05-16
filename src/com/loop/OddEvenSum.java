package com.loop;

public class OddEvenSum {
	public static void main(String[] args) {
		int num = 10;
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}

		System.out.println("Even sum = " + evenSum);
		System.out.println("Odd sum = " + oddSum);
	}

}
