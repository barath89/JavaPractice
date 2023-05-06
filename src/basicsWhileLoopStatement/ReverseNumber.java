package basicsWhileLoopStatement;

import java.util.Scanner;

public class ReverseNumber {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int number = sc.nextInt(); // eg 123
		int reminder, reverse = 0;

		while (number > 0) {
			reminder = number % 10; 	// Remainder 123%10 ==3
			number = number / 10;		// 123/10 -->12
			reverse = reverse * 10 + reminder; //0*10 =0 ---0+3 = 3
		}
		System.out.println(reverse);
	}

}
