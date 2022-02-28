package com.surya.java8;

/*
 class Demo implements FunctionalInterFace {
	 public void m1() {
		System.out.println("Hello......");
	}
}*/

public class LamdaExpression {

	public static void main(String[] args) {
		/* Demo d = new Demo();
		 d.m1();
		 FunctionalInterFace i  = new Demo();
		 i.m1();*/
         FunctionalInterFace i1  = () -> System.out.println("Hello.....By Lambda Expression");;
         i1.m1();
         Fn2 i2 = (a,b) -> System.out.println("The Sum :"+(a+b));
         i2.add(10,20);
	}

}
