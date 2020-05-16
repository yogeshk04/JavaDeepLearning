package src.loop;

public class LucasSeries {
	public static void main(String[] args) {
		int a, b, c, d;
		a = 1;
		b = 1;
		c = 1;

		int n = 10;

		// Lucas series: 1, 1, 1, 3, 5, 9, 17, . . .

		System.out.print("Lucas series: " + a + ", " + b + ", " + c);

		for (int i = 1; i <= (n - 3); i++) {
			d = a + b + c;

			a = b;
			b = c;
			c = d;
			System.out.print(", " + d);
		}
	}

}
