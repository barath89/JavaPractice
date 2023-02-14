package com.java8.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimit {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,4,8,2,3,7,9,2,8,5,88,2,4,6,3,5);
		
		List<Integer> limitInt=list.stream().limit(5).collect(Collectors.toList());
		System.out.println(limitInt);
		
		int sumOfLimit=limitInt.stream().reduce((p,q)->p+q).get();
		System.out.println(sumOfLimit);
		
		List<Integer> skipInt = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(skipInt);
		
		int sumOfSkip=skipInt.stream().reduce((x,y)->x+y).get();
		System.out.println(sumOfSkip  );
	}

}
