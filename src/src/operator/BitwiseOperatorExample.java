package src.operator;

public class BitwiseOperatorExample {
	public static void main(String[] args) {
		int a = 3, b = 6, c;

		c = a & b;
		System.out.println(" a & b = " + c);

		c = a | b;
		System.out.println(" a | b = " + c);

		c = a ^ b;
		System.out.println(" a ^ b = " + c);

		c = ~b;
		System.out.println(" ~ b = " + c);

		c = a << 3;
		System.out.println(" a << 3 = " + c);

		c = b >> 2;
		System.out.println(" b >> 2 = " + c);

		a = -1;
		c = a >>> 24;
		System.out.println("a >>> 24 = " + c);

		//		String s = "10101";
		//		String s1 = ~s;
		//		System.out.println("\n\n" + ~s);

		int i = 11;
		int j = ~i;
		System.out.println("j: " + j);
	}

}
