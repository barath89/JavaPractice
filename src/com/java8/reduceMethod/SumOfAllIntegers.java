package com.java8.reduceMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllIntegers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,6,3);

//		T reduce(T identity, BinaryOperator<T> accumulator);
//
//		Where, identity is initial value 
//		of type T and accumulator is a 
//		function for combining two values.
//		reduce operation applies a binary operator to each element in the stream
//		where the first argument to the operator is the return value of the
//		previous application and second argument is the current stream element.
		
		Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
		System.out.println("Sum of Integer : " +sum.get());
	}

}
