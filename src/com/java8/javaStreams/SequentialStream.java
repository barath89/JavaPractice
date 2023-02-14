package com.java8.javaStreams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {

	public static void main(String[] args) {
		//1) Basic Sequential Stream
		Stream<String> streams = Stream.of("Naveen","Raj","Guru","Kon");
		//streams.forEach(ele->System.out.println(ele));
		streams.forEach(System.out::println);
		
		//2 Using findFirst()
		System.out.println("---Using findFirst()---");
		Arrays.asList("a1","a2","a3").stream().findFirst().ifPresent(System.out::println);

		//3 Range between 1-5
		System.out.println("---Range between 1-5---");
		IntStream.range(1, 10).forEach(System.out::print);
		
		//4 Average
		System.out.println("Average of the given Number");
		Arrays.asList(1,2,3,4,5).stream().map(n->2*n +1).mapToInt(e->e).average().ifPresent(System.out::println);                                                            
		
	}

}
