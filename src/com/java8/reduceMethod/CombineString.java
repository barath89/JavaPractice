package com.java8.reduceMethod;

import java.util.Arrays;
import java.util.Optional;

public class CombineString {

	public static void main(String[] args) {
		
		String[] str = {"Love","is","Life"};
		// The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
		Optional<String> combineString= Arrays.stream(str).reduce((s1, s2)->s1+" "+s2);
		
		if(combineString.isPresent()) {
			System.out.println(combineString.get());
		}

	}

}
