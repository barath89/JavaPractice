package com.javatpoint.StringExamples;

public class P03_CountNoOfVowelsInString {

	public static void main(String[] args) {
		String str = "Nothing is defiend as a loss. Change is you";
		int count=0;
		str=str.toLowerCase();
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='0'||str.charAt(i)=='u') {
				count++;
			}
			
		}
System.out.println(count);
	}

}
