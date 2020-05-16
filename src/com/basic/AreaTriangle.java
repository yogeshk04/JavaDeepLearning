package com.basic;

public class AreaTriangle {
	public static void main(String[] args) {
		double area, a, b, c, s;
		
		a=5;
		b=5;
		c=5;
		
		s = (a+b+c)/2;
		
		area = Math.sqrt(s* (s-a)*(s-b)*(s-c));
		System.out.println("Area of a triangle is: " + area);
	}

}
