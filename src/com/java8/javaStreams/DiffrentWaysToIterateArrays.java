package com.java8.javaStreams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DiffrentWaysToIterateArrays {

	public static void main(String[] args) {
		ArrayList<String> shows = new ArrayList<String>();
		shows.add("Minion");
		shows.add("The Prison Break");
		shows.add("Panchayath");
		shows.add("The Good Doctor");
		shows.add("Breaking Bad");
		
		System.out.println(shows);
		
		
		//1. Using Java 8 forEach
		System.out.println("---Using Java 8 forEach---");
		
		shows.forEach(ele->System.out.println(ele));
		
		//2 Using Iterator
		System.out.println("----Using Iterator----");
		
		Iterator<String> it = shows.iterator();
		while(it.hasNext()){
			String tvSeries = it.next();
			System.out.println(tvSeries);
			
		}
		 
		//3 Using Iterator and Java 8 Lambda Exp
		System.out.println("---Using Iterator and Java 8 Lambda Exp---");
		Iterator<String> it1 = shows.iterator();
		it1.forEachRemaining(e->System.out.println(e));
		
		//4 Using ForEach Loop
		System.out.println("---Using ForEach Loop---");
		
		for(String tvShows:shows) {
			System.out.println(tvShows);
		}
		
		//5 Using listIterator
		
		System.out.println("---Using listIterator---");

		ListIterator<String> listIterator = shows.listIterator(shows.size());
		while(listIterator.hasPrevious()){
			String previousIterator = listIterator.previous();
			System.out.println(previousIterator);
		}
		}
	}
	


