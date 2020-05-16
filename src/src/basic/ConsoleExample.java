package src.basic;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console cn = System.console();
		
		int n;
		
		System.out.println("Enter the number:");
//		n = Integer.parseInt(cn.readLine());
		n = Integer.parseInt(cn.readLine());
		System.out.println(n);
	}

}
