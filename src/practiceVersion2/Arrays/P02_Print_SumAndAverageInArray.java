package practiceVersion2.Arrays;

import java.util.Scanner;

public class P02_Print_SumAndAverageInArray {

	public static void main(String[] args) {
		//Get From user and Sum and Average of array value
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of the Array : ");
		
		int size = s.nextInt();
		
		int a[] = new int [size];
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			
			a[i]= s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of the given Array "+sum);
		
		float average= sum/a.length;
		
		System.out.println("Average value of the given Array "+average);
		
	}

}
