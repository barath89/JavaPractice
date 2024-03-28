package com.javatpoint.StringExamples;

import java.util.Arrays;

public class P04_Anagram {

	public static void main(String[] args) {
		
		String str1 = "Keep";
		String str2 = "Peek";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("Both strings are not Anagram");
		}
		else {
		char[] string1=str1.toCharArray();
		char[] string2=str2.toCharArray();
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		if(Arrays.equals(string1, string2)) {
			System.out.println("The Given string is Anagram");
		}
		else {
			System.out.println("The Given string is not a Anagram");
		}
		}
	}

}
