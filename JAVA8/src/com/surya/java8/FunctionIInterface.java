package com.surya.java8;

import java.util.function.*;
import java.util.*;

class Student {
	String name;
	int marks;
	Student(String Name,int marks) {
		this.name = name;
		this.marks = marks; 
	}
}

public class FunctionIInterface {

	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
		//write a function its take string as a argument and is as to return length of the string
		Function<String,Integer> F = s -> s.length();
		System.out.println(F.apply("durga"));
		
		Function<String,String> F1 = s1 -> s1.toUpperCase();
		System.out.println(F1.apply("durga"));
		
		// Can u return Grade of the student based on the marks
		// input --> perform operation --> output
       // student ---> Find Grade --> return Grade
		Function<Student,String> f3 = s -> {
			int marks = s.marks;
			String grade = "";
			if(marks >= 80) grade ="A[Dictinction]";
			else if(marks>=60) grade="B[First Class]";
			else if (marks >= 50) grade ="C[second Class]";
			else if (marks >= 35) grade ="D[Third Class]";
			else grade = "E[Failed]";
			return grade;
		};
		Student[]  s =  { new Student("Durga",100),
				new Student("Sunny",65),
				new Student("Bunny",55),
				new Student("Chinny",45),
				new Student("Vinny",25),
                
		};
		for(Student s1 : s) 
		{
			System.out.println("Student Name :"+s1.name);
			System.out.println("Student Marks :"+s1.marks);
			System.out.println("Student Grade :"+f3.apply(s1));
			System.out.println("=========================");
			
		}
		
	} //Method
}   // Class
