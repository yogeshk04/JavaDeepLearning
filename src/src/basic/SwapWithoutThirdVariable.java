package src.basic;

public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		int a, b;

		a = 10;
		b = 30;

		System.out.println("Before swap: " + a + " " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swap: " + a + " " + b);
	}

}
