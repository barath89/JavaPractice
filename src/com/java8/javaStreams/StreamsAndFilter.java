package com.java8.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAndFilter {

	public static void main(String[] args) {
		//Use Case - Print without Shoes from Array
		
		List<String> li = Arrays.asList("Book","Pen","Mug","Shoes","Light");
		li.stream().filter(str->!str.equals("Shoes")).collect(Collectors.toList()).forEach(str->System.out.println(str));
		
		System.out.println("---System.out::print----");
		List<String> items = li.stream().filter(str->!str.equals("Light")).collect(Collectors.toList());
		items.forEach(System.out::print);

	}

}
