package string;

import java.util.LinkedHashSet;

public class S03_RemoveDuplicatesInString {

	public static void main(String[] args) {
		
		String str = "I Love Programming";

		removeDuplicates(str);
	}

	
	public static void removeDuplicates(String str) {
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i=0 ; i<str.length();i++) {
			set.add(str.charAt(i));
		}
		
		for (Character character : set) {
			System.out.print(character);
		}
		
	}
}
