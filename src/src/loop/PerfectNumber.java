package src.loop;

public class PerfectNumber {
	public static void main(String[] args) {
		int num, sum;
		sum = 0;
		num = 40;

		for (int i = 1; i <= (num / 2); i++) {
			System.out.println(num + " % " + i + " = " + num % i);
			if (num % i == 0) {

				sum = sum + i;
			}

		}
		if (sum == num) {
			System.out.println("Perfect number");
		} else
			System.out.println("Not a perfect number");
	}

}
