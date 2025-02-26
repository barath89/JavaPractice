package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class S04_PrintDuplicateElementsFromTheString {

	public static void main(String[] args) {
		String str = "Mahabarath";
		printDuplicateElements(str);

	}
	
	public static void printDuplicateElements(String str) {
		
		if(str == null) {
			System.out.println("Null String");
		return;
						}
		
		if(str.isEmpty()) {
			System.out.println("Empty String");
		return;
						}
		
		if(str.length()<=1){
			System.out.println("Single Character String");
			return;
							}
		
	char [] ch = str.toCharArray();
		
	Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	
	for (char c : ch) {
		if(charMap.containsKey(c)) {
			charMap.put(c, charMap.get(c)+1);
		}
		else {
			charMap.put(c, 1);
		}
	}
	 
	Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
	
	for (Map.Entry<Character, Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
	}
	
	}

}
