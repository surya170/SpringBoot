package com.surya.java8;

@FunctionalInterface
public interface FunctionalInterFace {
	public void m1(); // abstract methods
	/*public void m2();*/

	default void m3() // default methods
	{

	}

	public static void m4() // static methods
	{
		
	}
}


@FunctionalInterface
interface A {
	public void m1();
}

//@FunctionalInterface
interface B extends A {
	public void m2();
}