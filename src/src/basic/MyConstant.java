package src.basic;

public class MyConstant {

	public static void main(String[] args) {
		System.out.println("Number of monts: " + Constant.NUM_OF_MONTS);
		System.out.println("Vlaue of Pi = " + Constant.PI);
	}

	class Constant {

		public static final int NUM_OF_MONTS = 12;
		public static final double PI = (double) 22 / 7;

	}
}