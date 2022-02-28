package com.surya.java8;

import java.util.function.Predicate;

public class JAVA8 {
	//write a function  which can take integer value as argument and return square of that value
	public static int squareIt(int n) {
		return n*n;
	}
	public static void main(String[] args) {
		
		/*    System.out.println("The Square of 4:"+squareIt(4));
		System.out.println("The Square of 5:"+squareIt(5));*/
        
		/*Function<Integer,Integer> f =i->i*i;
		System.out.println("The Square of 4:"+f.apply(4));
		System.out.println("The Square of 5:"+f.apply(5));
		*/       
		
		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(4));   // o/p : true
		System.out.println(p.test(5));   // o/p : false
		
		
		
	}
}
