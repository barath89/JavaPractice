package practiceVersion2.WhileLoop;

public class P05_PalindromeNumber {

	public static void main(String[] args) {
		
		int number = 122, reminder,reverse=0, temp=number;
		
		while(number>0) {
			
			reminder=number%10;
			number = number/10;
			reverse = reverse*10+reminder;
		}
		
		if(temp==reverse) {
			System.out.println("Given Number is Palindrome");
		}
		else {
			System.out.println("Given Number is not a Palindrome");
		}
}
}