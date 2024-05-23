package practiceVersion2.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class P09_SortArrayInDescendingOrder {

	public static void main(String[] args) {
		
		int a[] = {34,-12,0,78,-98};
		
		int temp;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0 ; k<a.length; k++) {
			System.out.println(a[k]);
		}
		 Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, -100 };
		 
	        // Sorts arr[] in descending order using
	        // reverseOrder() method of Collections class
	        // in Array.sort() as an argument to it
	        Arrays.sort(arr, Collections.reverseOrder());
	 
	        for (Integer integer : arr) {
				System.out.print(integer+ " ");
			}
	        // Printing the array as generated above
	       // System.out.println("Modified arr[] : "
	                         //  + Arrays.toString(arr));

	}

}
