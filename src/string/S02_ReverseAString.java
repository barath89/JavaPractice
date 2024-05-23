package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class S02_ReverseAString {

	public static void main(String[] args) {
		 String str = " Mahabarath";
		 String str1 = "Kabilan";
		 
		 String rev = "";
		 
		 StringBuffer sb = new StringBuffer(str);
		 
		 System.out.println(sb.reverse());
	
		 System.out.println("*****************************************");
		 
		 for(int i= str1.length()-1; i>=0 ; i--) {
			 
			 rev = rev+ str1.charAt(i);
		 }
		 System.out.println(rev);
		 
		 System.out.println("*****************************************");
		 
		 String str2 = "BE CONSISTANT";
	
		 String[] charArray = str2.split("");
		 
		 List<String> list = new ArrayList<String>(Arrays.asList(charArray));
		 
		 Collections.reverse(list);
		 
		 ListIterator<String> iterater = list.listIterator();
		 while (iterater.hasNext()) {
			 System.out.print(iterater.next());
			
			
		}
		 
	}

}
