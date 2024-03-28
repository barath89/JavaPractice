package com.javatpoint.StringExamples;



public class P01_CountNoOfCharactersInString {

	public static void main(String[] args) {
		String str = "Today is My Day";
		int count=0;
		for(int i=0 ; i<str.length();i++) {
			if(str.charAt(i)!=' ')
			count++;
		}
		System.out.println(count);

	}

}
