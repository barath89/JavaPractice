package basicsWhileLoopStatement;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number = 121;
		int reminder, temp;
		int reverse = 0;
		temp = number;

		while (number > 0) {
			reminder = number % 10;         
			number = number / 10;
			reverse = (reverse * 10) + reminder;
		}
		System.out.println(reverse);

		if (temp == reverse) {
			System.out.println("Number is Palindrome");
		} else
			System.out.println("Number is not a Palindrome");

	}

}
