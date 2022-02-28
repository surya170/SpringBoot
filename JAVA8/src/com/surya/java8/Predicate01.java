package com.surya.java8;

import java.util.function.Predicate;
import java.util.*;

class Employee {
	String Name;
	double salary;

	Employee(String name, double salary) {
		this.Name = name;
		this.salary = salary;
	}
}

public class Predicate01 {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i % 2 == 0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(11));
		
		/*Predicate<Employee> p1 = e ->  e.salary > 10000 && e.isHavingGF==true;
		System.out.println(p1.test(e));*/
		
       //	write a predicate to check whether length of String is > 5 or not
		String[] s = {"Nag","Chiranjeevi","Venky","Balaiah","Sunny","Katrina"};
		Predicate<String>  p = s1 -> s1.length()>5;
		for(String s1 : s) 
		{
			if(p.test(s1)) 
			{
				System.out.println(s1);
			}
		}
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Durga",1000) );
		l.add(new Employee("Mahesh",2000) );
		l.add(new Employee("Ravi",3000) );
		l.add(new Employee("Mahi",4000) );
		l.add(new Employee("Virat",5000) );
		
		Predicate<Employee> p2 = e -> e.salary>3000;
		for(Employee e1 : l) 
		{
			if(p2.test(e1)) 
			{
				System.out.println(e1.Name+":"+e1.salary);
			}
		}

		
	} // Main Method
} // Class
