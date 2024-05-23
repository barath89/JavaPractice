package practiceVersion2.Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class P17_RemoveDuplicatesInArray {
	  public static void main(String[] args) 
	    {       
	        removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
	         
	       // removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
	         
	       // removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
	         
	        //removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
	    } 
	 static void removeDuplicates(int[] arrayWithDuplicates)
	    {
	        	         
	        Set<Integer> set = new LinkedHashSet<Integer>();      //Use HashSet if you don't want insertion order
	         
	        for (int i = 0; i < arrayWithDuplicates.length; i++) 
	        {
	            set.add(arrayWithDuplicates[i]);
	        }
	        
	        for (Integer integer : set) {
				System.out.println(integer);
			}
	         
			/*
			 * //Converting set into an array
			 * 
			 * Object[] arrayWithoutDuplicates = set.toArray();
			 * 
			 * //Printing arrayWithoutDuplicates
			 * 
			 * System.out.println();
			 * 
			 * System.out.println("Array Without Duplicates : ");
			 * 
			 * for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
			 * System.out.print(arrayWithoutDuplicates[i]+"\t"); }
			 * 
			 * System.out.println();
			 * 
			 * System.out.println("==============================");
			 */
	    }
	     
}
