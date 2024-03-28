package practiceVersion2.WhileLoop;

public class P04_PrintReverseOfaNumber {

	public static void main(String[] args) {
		int num = 1234 , rem, rev=0;
		
		while(num>0) {
			
			rem=num%10; //4
			num=num/10; // 123
			rev=rev*10+rem;
		}
		System.out.println("Reverse of the number is " + rev);

	}

}
