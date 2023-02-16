package Basics;


public class RegEx {

	public static void main(String[] args) {
		String s= "12$&%&*%43non&%@@%JJKFCJHBM(&&%&$fegr*&$$&*8e2556&4621";
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		System.out.println("-----------------------------------------");
		System.out.println(s1);
		

	}
	
}
