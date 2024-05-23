package practiceVersion2.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class P07_PrintMinimumNumber_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		System.out.print("Enter Size of an Array :");
		size=sc.nextInt();
		 int a[] = new int[size];
		System.out.print("Enter "+size+ " values for the given array :");
		
		for(int i=0; i<a.length; i++) {
			
			a[i]= sc.nextInt();
		}
		
		int min=a[0];
		
		for(int j=0; j<a.length; j++) {
			
			if(a[j]<min) {
				min=a[j];
			}
		}
		System.out.println("Minimum Value : "+min);
		
		/* */
	}

}
