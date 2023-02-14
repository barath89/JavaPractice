package com.java8.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodMap {

	public static void main(String[] args) {
		
		//Number*3
		
		List<Integer> list = Arrays.asList(3,4,5,6);
		list.stream().map(n->n*3).forEach(System.out::println);
		
		//converting Lowercase to Uppercase
		
		List<String> lowerToUpperCase = Arrays.asList("good","days","are","coming","soon");
		lowerToUpperCase.stream().map(e->e.toUpperCase()).forEach(System.out::println);
		
		//Find Length of each string in Array
		List<String> lenghtOfString = Arrays.asList("hope","is","your","asset");
		
		Stream<Object> lengthofword=lenghtOfString.stream().map(str->str.length());
		lengthofword.forEach(System.out::println);
	}

}
