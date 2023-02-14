package com.java8.javaStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Predicate {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,3,5,6,3,34,56,98,89,75,44);
		list.stream().filter(x->x>50 && x<60).collect(Collectors.toList()).forEach(System.out::println);

	}

}
