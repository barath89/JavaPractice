package java20Programs;

import java.util.Iterator;

public class P01_FibonnacciSeries_UsingRecursion {

	public static void main(String[] args) {
			int n = 6;
			
			for(int i=0; i<n; i++) {
				System.out.print(fibNumb(i)+ " ");
				
			}


	}
	
	public static int fibNumb(int n) {
		if((n==0)||(n==1))
			return n;
		
		else 
			return fibNumb(n-1)+ fibNumb(n-2);
		
		
		
		
		
	}

}
