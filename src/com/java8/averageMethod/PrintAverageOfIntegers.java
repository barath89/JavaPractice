package com.java8.averageMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintAverageOfIntegers {

	public static void main(String[] args) {
		//mapToInt - convert the Stream to IntStream
	//Using maptoInt
		
		Double avg= Stream.of(34,45,65,23).mapToInt(e->e).average().getAsDouble();
		System.out.println("Using mapToInt : "+avg);
	//Using IntStream
		
		Double d =IntStream.of(23,34,54,65).average().getAsDouble();
		System.out.println("Using IntStream : "+d);
		
	//Using DoubleStream
		//Create a stream
		DoubleStream stream = DoubleStream.of(34.33,87.56,34,55.55);
		 // OptionalDouble is a container object
        // which may or may not contain a
        // double value.
		
		OptionalDouble dd =stream.average();
		
		if(dd.isPresent()) {
			System.out.println("Using Double : "+dd.getAsDouble());
		}
		else
		{
			System.out.println(-1);
		}
		
		//Average of Numbers greater than 100
		List<Integer> greNum= Arrays.asList(3,10,30,40,50);
		OptionalDouble greaterAvg=greNum.stream().map(e->e*e).
				filter(num->num>100).mapToInt(q->q).average();
		System.out.println("Average number greater: "+greaterAvg.getAsDouble());
	
	}

}
