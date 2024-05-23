package practiceVersion2.Arrays;

import java.util.Scanner;

public class P06_PrintMaximumNumber_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.println("Enter Size of an Array : ");
		size= sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " +size+" values to the array");
		
		for(int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];
		
		for (int j=0 ; j<a.length; j++) {
			
			if(a[j]>max) {
				max=a[j];
			}
			
		}
		System.out.println("Maximum Number from entered array is: "+max);

	}

}
