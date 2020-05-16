package com.polymorphism;

public class OverridingExample {
	public static void main(String[] args) {

		Parent1 p = new Parent1();
		p.propery();
		p.marry();

		Child c = new Child();
		c.marry();

		// compile = runtime	
		Parent1 p1 = new Child();
		p1.marry();
		p1.propery();
	}

}

class Parent1 {
	public void propery() {
		System.out.println("Parents property");
	}

	public void marry() {
		System.out.println("Parent decide marriage...");
	}

}

class Child extends Parent1 {
	@Override
	public void marry() {
		System.out.println("Child decided his marriage");

	}

	public void temp() {
		System.out.println("Temp");

	}

}
