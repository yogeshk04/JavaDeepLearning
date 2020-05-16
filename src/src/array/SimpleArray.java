package src.array;

public class SimpleArray {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };

//		for(int i : a) {
//			System.out.println(a[i]);
//		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("==> " + a[i]);
		}
	}

}
