package org.example;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("Long hash is " + Long.hashCode(a.longValue));
	}
}