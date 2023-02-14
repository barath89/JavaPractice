package com.java8.javaStreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class MethdFatMap {

	public static void main(String[] args) {

		String data [][] = new String [][] {
			{"a","b"},{"c","d"},{"e","f"}
		};
//		Stream<String[]>dataStream= Arrays.stream(data);
//		Stream<String> dataStreamFlatMap = dataStream.flatMap(x->Arrays.stream(x));
//		Stream <String> dt1 = dataStreamFlatMap.filter(x->"a".equals(x.toString()));
//		dt1.forEach(System.out::println);
		
		
		 Stream<String> finalStream = Arrays.stream(data).
				flatMap(x->Arrays.stream(x)).
				filter(x->"a".equals(x.toString()));
		 
				finalStream.forEach(System.out::println);
	}

}
