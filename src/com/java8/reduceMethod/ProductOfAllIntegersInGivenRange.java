package com.java8.reduceMethod;

import java.util.stream.IntStream;

public class ProductOfAllIntegersInGivenRange {

	public static void main(String[] args) {
		
		// Implementation of reduce method
		// to get the product of all numbers
		// in given range
		
		int prod=IntStream.range(2, 8).reduce((a,b)->a*b).orElse(-1);
		System.out.println(prod);
	}

}
