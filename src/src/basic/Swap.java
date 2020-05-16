package src.basic;

public class Swap {
	public static void main(String[] args) {
		int a, b, c;

		a = 10;
		b = 20;

		System.out.println("Before swap: " + a + " " + b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After swap: " + a + " " + b);
		
	}

}

