package practiceVersion2.Arrays;

import java.util.Scanner;

public class P01_PrintFirstAndLastNumberInArray {

	public static void main(String[] args) {
		try (// Print First and Last number in array which get from USer
		Scanner s = new Scanner(System.in)) {
			int size;
			
			System.out.println("Enter Size Of an Array: ");
			
			size= s.nextInt();
			
			int a[]=new int [size];
			
			for(int i=0; i<a.length;i++) {
				
				a[i]=s.nextInt();
			}
			
			System.out.println("First Value in an Array - " +a[0]);
			System.out.println("Last Value in an Array - "+a[a.length-1]);
		}

	}

}
