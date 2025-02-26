package practiceVersion2.WhileLoop;

public class P03_PrintAtoZ_ZtoA_AlternateCharacters {

	public static void main(String[] args) {
		
		char ch1 = 'A',ch2='Z';
		while(ch1<='Z') {
			
			System.out.println(ch1);
			ch1++;
		}
		 System.out.println("Print Z to A");
		 
		 while(ch2>='A') {
			 
			 System.out.println(ch2);
			 ch2--;
		 }
		 System.out.println("Print Alternate Characters");
		 char ch3 ='A';
		 while(ch3<='Z') {
			 System.out.println(ch3);
			// ch3=(char) (ch3+2);
			 ch3+=2;
			 
		 }
	}

}
