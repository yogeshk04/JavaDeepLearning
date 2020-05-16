package src.loop;

public class FactorialNumber {
	public static void main(String[] args) {
		int i, n, f;
		f = 1;
		n = 10;

		for (i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println("Factorial of " + n + " is " + f);
	}

}
