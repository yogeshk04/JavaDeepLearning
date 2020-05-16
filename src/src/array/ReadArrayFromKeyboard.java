package src.array;

import java.util.Scanner;

public class ReadArrayFromKeyboard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the values: ");
			array[i] = input.nextInt();
		}

		System.out.println("Array elements are: ");
		{
			for (int i = 0; i < 5; i++) {
				System.out.println("Array at index-" + i + " is " + array[i] + ", ");
			}
		}
	}

}
