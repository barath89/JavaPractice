package com.java8.javaStreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateElements {

	public static void main(String[] args) {
		//Using Collections.frequency
		//Slowest algorithum
		//List<Integer> list=Arrays.asList(2,3,4,2,3,4,5,6,7,8,8,5,7);
		
//		Set<Integer> dupNum = list.stream().
//				filter(e->Collections.frequency(list, e)>1).
//				collect(Collectors.toSet());
//		System.out.println(dupNum);
//		
//		Using HashSet
//		Fastest Algorithum
		List<Integer> list1 = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

        Set<Integer> result = findDuplicateBySetAdd(list1);

        result.forEach(System.out::println);
		
		
		}
		
	

public static Set<Integer> findDuplicateBySetAdd(List<Integer> list1) {
	
	Set<Integer> dup = new HashSet<>();
	return list1.stream().filter(n->!dup.add(n)).collect(Collectors.toSet());
	
}
}
