package com.loop;

public class FibonacciSeries {
	public static void main(String[] args) {

		// series : 0, 1, 2, 3, 5, 8, 13...
		long a, b, n, c;

		a = 0;
		b = 1;

		n = 50;

		System.out.print("Series: " + a + ", " + b);

		for (int i = 1; i <= (n - 2); i++) {

			c = a + b;

			a = b;
			b = c;
			System.out.print(", " + c);
		}

	}

}
