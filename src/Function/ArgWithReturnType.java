package Function;

import java.util.Scanner;

public class ArgWithReturnType {
	public static void main(String[] args) {

		double r, h, vol;
		System.out.println("Enter the raius: ");
		Scanner s = new Scanner(System.in);
		r = s.nextDouble();
		System.out.println("Enter the height: ");
		h = s.nextDouble();
		s.close();

		vol = CylinderVolume(r, h);
		System.out.println("Volume of cylinder is : " + vol);

	}

	static double CylinderVolume(double r, double h) {

		double v = 3.14 * r * r * h;
		return v;

	}

}
