package com.javatpoint.StringExamples;

public class P05_DivideStringInNequalParts {

	/*public static void main(String[] args) {
		String str="aaaabbbbcccc";
		int len=str.length();
		int n =3;
		int chars=len/n;
		String [] equalStr = new String[n];
		int temp=0;
		
		if(len%n!=0) {
			System.out.println("The given string is not possibble to div in equal parts");
		}
		else {
		for(int i=0; i<len;i=i+chars) {
			
			String part = str.substring(i,i+chars);
			equalStr[temp]=part;
			temp++;
		}
		System.out.println(+n+" equal part of the given string is");
		for(int j=0; j<equalStr.length; j++ ) {
			
			System.out.println(equalStr[j]);
		}
		
		}
	}*/
 static void divideString(String str, int n)
    {
        int str_size = str.length();//12
        int part_size;
 
        // Check if string can be divided in // n equal parts
        if (str_size % n != 0) {
            System.out.println("Invalid Input: String size"
                               + "is not divisible by n");
            return;
        }
 
        // Calculate the size of parts to find // the division points
        part_size = str_size / n; // 12/3 = 4
 
        for (int i = 0; i < str_size; i++) { // 0<12
            if (i % part_size == 0)         // 0/4=0
                System.out.println();
            System.out.print(str.charAt(i)); //0th index
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // length of string is 28
        String str = "aaaabbbbcccc";
 
        // Print 4 equal parts of the string
        divideString(str, 3);
    }
}
