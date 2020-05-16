package Function;

import java.util.Scanner;

public class VolArgNoReturnType {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the radius: ");
		double r = sc.nextDouble();
		System.out.println("Enter the height: ");
		double h = sc.nextDouble();
		CylinderVolume(r, h);

	}

	static void CylinderVolume(double r, double h) {
		double v;

		v = 3.14 * r * r * h;
		System.out.println("Cylinder volume: " + v);

	}

}
