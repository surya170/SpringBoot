package com.java8.java02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");

		List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedList);

		// using lambda expression

		List<String> sortedList1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());

		List<String> sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList2);

		// descending order
		System.out.println("======== Descending Order ===========");
		List<String> sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList3);

		List<String> sortedList4 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortedList4);

		// sorted the employee by their salary
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 30, 400000));
		employees.add(new Employee(20, "Santosh", 29, 350000));
		employees.add(new Employee(30, "Sanjay", 30, 450000));
		employees.add(new Employee(40, "Pramod", 29, 500000));

		/*      List<Employee> employeeSortedList = employees.stream().sorted(new Comparator<Employee>() { 
		    	  @Override
		    	  public int compare(Employee o1, Employee o2) {
		    		  return (int) (o1.getSalary() - o2.getSalary());
		    	  };
		      }).collect(Collectors.toList());
		*/
		// in Ascending order
		List<Employee> employeeSortedList = employees.stream()
				.sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
		System.out.print(employeeSortedList);
		System.out.println();
		// In desc order
		List<Employee> employeeSortedList2 = employees.stream()
				.sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
		System.out.print(employeeSortedList2);
		System.out.println();
        
		// in ascending order using comparator method
		List<Employee> employeeSortedList3 = employees.stream()
				   .sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
		System.out.print(employeeSortedList3);
		System.out.println();
		
		// in desc
		List<Employee> employeeSortedList4 = employees.stream()
				   .sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.print(employeeSortedList4);
		System.out.println();
		
		

	}

}
