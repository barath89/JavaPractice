package com.java8.javaStreams;

import java.util.List;

public class LamdaExpAndMethoRef {

	public static void main(String[] args) {

		List<String> names = List.of("Tom", "Peter", "Kavin", "Somu");

		// Lamda Exp
		System.out.println("---Using Lamda Expression---");
		names.forEach(e -> System.out.println(e));
		// Method Reference

		System.out.println("---Using Method Reference---");
		names.forEach(System.out::println);
	}

}
