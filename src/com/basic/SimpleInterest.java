package com.basic;

public class SimpleInterest {
	public static void main(String[] args) {
		double a, p, r, n, ci;

		p = 100;
		r = 10;
		n = 3;
		a = p * Math.pow((1 + (r / 100.0)), n);
		ci = a - p;

		System.out.println("Amount = " + a);
		System.out.println("Conpunt interst = " + ci);
	}

}
