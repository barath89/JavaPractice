package com.java8.reduceMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {

	public static void main(String[] args) {
		List<String> longStr = Arrays.asList("Mahabarath","Have Confidence",
				"Love the way you are");
		// The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
		Optional<String> longestString = longStr.stream().
				reduce((s1, s2) -> s1.length()>s2.length() ?s1:s2);
		
		System.out.println(longestString.get());

	}

}
