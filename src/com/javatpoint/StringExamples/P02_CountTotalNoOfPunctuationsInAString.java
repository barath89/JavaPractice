package com.javatpoint.StringExamples;

public class P02_CountTotalNoOfPunctuationsInAString {

	public static void main(String[] args) {
		String str = "hey Maha! Hope, You had a 'Great' Day.";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)=='\''||str.charAt(i)=='\"'||str.charAt(i)=='.') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
