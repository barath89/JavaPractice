package com.java8.javaStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(34,6,46,77,23,26,90);
		//Ascending
		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		List<Integer> ascendingOrder = list.stream().sorted().collect(Collectors.toList());
		System.out.println(ascendingOrder);
		//Descending
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		List<Integer> descendingOrder=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descendingOrder   );
	}

}
