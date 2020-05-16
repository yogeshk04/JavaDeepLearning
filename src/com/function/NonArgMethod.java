package com.function;

import java.util.Scanner;

public class NonArgMethod {
	public static void main(String[] args) {
		CylinderVolume();
	}

	static void CylinderVolume() {
		double r, h, volume;
		final double PI = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		r = input.nextDouble();
		System.out.println("Enter the height: ");
		h = input.nextDouble();
		
		volume = PI * r * r * h;
		System.out.println("Volume of cyliner is: " + volume);
	}
}
