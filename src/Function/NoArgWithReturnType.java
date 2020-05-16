package Function;

import java.util.Scanner;

public class NoArgWithReturnType {
	public static void main(String[] args) {

		double volume = VolumeCylinder();
		System.out.println(volume);
	}

	static double VolumeCylinder() {
		double r, h, v;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r = sc.nextDouble();
		System.out.println("Enter the height of cylinder: ");
		h = sc.nextDouble();

		v = 3.14 * r * r * h;

		sc.close();
		return v;
	}
}
