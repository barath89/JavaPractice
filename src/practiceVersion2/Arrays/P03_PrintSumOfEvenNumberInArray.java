 package practiceVersion2.Arrays;

import java.util.Scanner;

public class P03_PrintSumOfEvenNumberInArray {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Size of the array");
			int size = sc.nextInt();
			
			System.out.println("Enter " +size+ " values for the array");
			int a[] = new int[size];
			
			for(int i=0; i<a.length; i++) {
				
				a[i]=sc.nextInt();
				
			}
			
		int sum=0;
		
		for(int j=0;j<a.length;j++) {
			
			if(j%2==0) {
				sum=sum+a[j];
			}
			
		}
		System.out.println("Even position of array is "+sum);
		}

		
	}

}
