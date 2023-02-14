package com.java8.javaStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximunAndMinimumNumber {

	public static void main(String[] args) {
	
		List<Integer> list= Arrays.asList(0,34,23,90,56,4,75);
		
		int max =list.stream().
				max(Comparator.comparing(Integer::valueOf))
				.get();
		System.out.println(max);
		
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
	}

}
