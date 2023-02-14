package com.java8.javaStreams;


public class Java14RecordKeyWord {

	public static void main(String[] args) {
		
//		List<EmployeeRecord> empDetails = Arrays.asList(
//				new EmployeeRecord("Tom",34),
//				new EmployeeRecord("Peter",24),
//				new EmployeeRecord("Kavin",54),
//				new EmployeeRecord("Surya",33),
//				new EmployeeRecord("Raja",29)
//				);
//		System.out.println(empDetails.);
//		//1 Reterive Details for Surya... findAny()
//		EmployeeRecord employeeSurya =empDetails.stream().filter(str->str.equals(str.get)).findAny().orElse(null);
//		System.out.println(employeeSurya);
		
		//2 Unavailable user it should print NULL
		
		EmployeeRecord e1 = new EmployeeRecord("Surya",33);
		
		System.out.println(e1);
		
	}

}
