package com.java8.javaStreams;

import java.util.Arrays;
import java.util.List;

public class MethodRepalceAll {

	public static void main(String[] args) {
		List<String> langList = Arrays.asList("Maha","Kabilan", "Saritha");
		System.out.println(langList);
		
		langList.replaceAll(ele->ele+" Happy");
		System.out.println(langList);
	}

}
