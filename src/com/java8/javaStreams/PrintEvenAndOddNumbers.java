package com.java8.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenAndOddNumbers {

	public static void main(String[] args) {
		//Even Number
		List<Integer> numberList = Arrays.asList(84,33,21,24,56,67);
		List<Integer> evenNum = numberList.stream().filter(n->n%2 == 0).collect(Collectors.toList());
		System.out.println("Even Number: "+evenNum.toString());
		
		//OddNumber
		numberList.stream().filter(n->n%2 != 0).
				collect(Collectors.toList()).forEach(System.out::println);;
	}

}
