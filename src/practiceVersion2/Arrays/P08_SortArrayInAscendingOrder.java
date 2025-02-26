package practiceVersion2.Arrays;

import java.util.Arrays;

public class P08_SortArrayInAscendingOrder {

	public static void main(String[] args) {
		
		int a[] = {34,23,67,12,0};
		
		//OP = {0,12,23,34,67}
		int temp;
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				}
		}
		for(int k=0; k<a.length; k++) {
		//	System.out.println(a[k]);
		}
		char[] chars = {'b', 'a', 'c'};
		 Arrays.sort(chars);
		 for (int num : chars) {
	           // System.out.print((char)num + " ");
		
	}
		 
           Arrays.sort(a);
           
           for (int c : a) {
        	  // System.out.print(c +"");
			
		}
           System.out.println(Arrays.toString(a));
           
	}}
