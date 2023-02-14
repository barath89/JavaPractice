package com.java8.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodNegate {

	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("Maha","Mah","Ma","M");
		Predicate<String> nameExp= x->x.startsWith("Ma");
		
		List<String> newNameList = nameList.stream().
											filter(nameExp.negate()).
											collect(Collectors.toList());
		System.out.println(newNameList);
	}

}
