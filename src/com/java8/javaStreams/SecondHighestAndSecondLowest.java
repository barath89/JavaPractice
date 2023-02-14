package com.java8.javaStreams;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;


public class SecondHighestAndSecondLowest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(67,78,78,34,34,45,56,89,32,44,56);
		
	int secondHighest=list.stream().sorted(Collections.reverseOrder()).distinct()
			.skip(1).findFirst().get();
	System.out.println(secondHighest);
	
	int secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
	System.out.println(secondLowest);
	}

}
