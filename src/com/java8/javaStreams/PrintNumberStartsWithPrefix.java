package com.java8.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumberStartsWithPrefix {

	public static void main(String[] args) {
		// java string valueOf() method converts different types of values into string
		List<Integer> number = Arrays.asList(2,234,222,345,34,54,298);
		number.stream().
		map(e->String.valueOf(e)).
		filter(el->el.startsWith("2")).
		map(Integer::valueOf).collect(Collectors.toList());
		

	}

}
