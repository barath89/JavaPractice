package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class S06_PrintOccuranceOfAllTheCharacters {

	public static void main(String[] args) {
		
		String str = "Where EvEr You GO Your Skill IS IMpORtaNt";
		
	printAllOccurances(str);
		String str2="";
	//	printAllOccurances(str2);
		String str3="A";
		//printAllOccurances(str3);
		String str4="2m3n4";
		//printAllOccurances(str4);
		//String str5=null;
		//printAllOccurances(str5);
	}
	
	public static void printAllOccurances(String str) {
		if(str == null) {System.out.println("NULL ");}
		if(str.isEmpty()) {System.out.println("Empty String");}
		if(str.length()==1) {System.out.println("Single Character String");}
		
		char[] ch =  str.toCharArray();
			
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for (char c : ch) {
			if(charMap.containsKey(c)) {
				charMap.put(c,charMap.get(c)+1);
			}
			else{
				charMap.put(c, 1);
			}
		}
		System.out.println(charMap);
	/*	
		Set<Map.Entry<Character, Integer>> entry = charMap.entrySet();
		
		for (Map.Entry<Character, Integer> entry2 : entry) {
			if (entry2.getValue()>1) {
				System.out.println(entry2.getKey()+":"+entry2.getValue());
				
			}
		}
		*/
	}

}
