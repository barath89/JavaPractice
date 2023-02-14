package com.java8.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodFindAny {

	public static void main(String[] args) {
		
		List <Employee> employeeList = Arrays.asList(
				new Employee("Tom",34),
				new Employee("Peter",24),
				new Employee("Kavin",54),
				new Employee("Surya",33),
				new Employee("Raja",29)
				);
		
		//System.out.println(employeeList);
		
//		Employee emp = new Employee("don", 45);
//		System.out.println(emp.getName());
		
		//1. Reterive Data for Surya
		
		Employee emp = employeeList.stream().filter(x-> "Surya".equals(x.getName())).findAny().orElse(null);
		System.out.println("Employee Name "+emp.getName() +" Employee Age "+emp.getAge());
		
		//2. If did not find any record in the list
		Employee emp1 = employeeList.stream().filter(x-> "DON".equals(x.getName())).findAny().orElse(null);
		System.out.println("Employee Name "+emp1);
		
		//3- Filter with Multiple Conditions 
		// Use Case - Check Name and Age are correct
		Employee emp2 = employeeList.stream().filter(x->"Raja".equals(x.getName()) && 29 == x.getAge()).findAny().orElse(null);
		System.out.println("Employee List with and condition " +emp2);
		
		//4 Stream-Filter-Map
		//Map()- convert one type to other
		String emp3 = employeeList.stream().filter(x->"Kavin".equals(x.getName())).map(Employee::getName).findAny().orElse(null);
		System.out.println("Employee List with Stream-Filter-Map -"+emp3);
		
		//5 Print all names from the list
		List<String> emp4 = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("List of employees : "+emp4);
		
		
		
	}
	

}
