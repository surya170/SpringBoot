package com.java8.J8;

import java.util.function.Function;

public class FunctionChaining {
	
	public static void main(String[] args) {
		
         Function<String,String> f1 = s -> s.toUpperCase();
         System.out.println(f1.apply("Surya"));
         
         Function<String,String> f2 = s -> s.substring(0,5);
         System.out.println(f2.apply("Surya Narayana"));
         
	}
}
