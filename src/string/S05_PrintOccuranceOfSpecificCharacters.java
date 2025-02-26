package string;

public class S05_PrintOccuranceOfSpecificCharacters {

	public static void main(String[] args) {
	
		String str = "I Love Programming";
		
		char ch = 'm';
		
		int count =0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == ch) {
				
				count++;
			}
		}
		System.out.println(count);
	}
	
	

}
