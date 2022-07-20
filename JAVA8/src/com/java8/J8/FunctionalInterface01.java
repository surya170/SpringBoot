package com.java8.J8;

@FunctionalInterface
interface Printable {
	void print(String message);

}

public class FunctionalInterface01 {

	public static void main(String[] args) {
		Printable pt = (message) -> System.out.println(message);
		pt.print("Hello");

	}

}
