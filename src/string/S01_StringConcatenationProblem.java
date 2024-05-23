package string;

public class S01_StringConcatenationProblem {

	public static void main(String[] args) {
		
		String s1 ="test";
		String s2 ="test";
		String s3 = new String("test");
		String s4 = new String(s1);
		
		System.out.println(s1==s2); //true --Compare Reference
		System.out.println(s1==s3); //false --Compare Reference
		System.out.println(s1==s4); //false --Compare Reference
		
		System.out.println(s1.equals(s2));//true --Compare Values
		System.out.println(s1.equals(s3));//true --Compare Values
		System.out.println(s1.equals(s4));//true --Compare Values
		
		String s5 = "Maha";
		//StringBuffer - Synchronized
		//StringBuilder - Not Synchronized
		StringBuffer sb = new StringBuffer(s5);
		
		System.out.println(sb.append("Barath"));//MahaBarath
		sb.insert(2, "Kabi");
		System.out.println(sb);//MaKabihaBarath
		sb.replace(2, 6, "SARI");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	

	}

}
