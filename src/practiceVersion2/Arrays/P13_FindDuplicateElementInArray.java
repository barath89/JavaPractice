package practiceVersion2.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
//https://javaconceptoftheday.com/java-array-interview-programs/
public class P13_FindDuplicateElementInArray {

	public static void main(String[] args) {
		int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
		  System.out.println("======Duplicates Using HashSet======");
          
	        findDuplicatesUsingHashSet(inputArray);
	  
	        System.out.println("======Duplicates Using HashMap======");
	          
	        findDuplicatesUsingHashMap(inputArray);

	}
	  private static void findDuplicatesUsingHashSet(int[] inputArray)
	    {
	        HashSet<Integer> set = new HashSet<Integer>();
	          
	        for (int element : inputArray) 
	        {
	            if( set.add(element)==false)
	            {
	                System.out.println("Duplicate Element : "+element);
	            }
	        }
	    }
	      
	    //Method 4 : Using HashMap
	      
	    private static void findDuplicatesUsingHashMap(int[] inputArray)
	    {
	        HashMap<Integer, Integer> map = new HashMap<>();
	          
	        for (int element : inputArray) 
	        {   
	            if(map.get(element) == null)
	            {
	                map.put(element, 1);
	            }
	            else
	            {
	                map.put(element, map.get(element)+1);
	            }
	        }
	          
	        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
	          
	        for (Entry<Integer, Integer> entry : entrySet) 
	        {               
	            if(entry.getValue() > 1)
	            {
	                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
	            }
	        }
	    }
}
