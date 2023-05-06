package basicsWhileLoopStatement;

public class WhileLoopNumbersAndAlphabets {

	public static void main(String[] args) {

		// Print 1-30
		int i = 1;
		while (i <= 30) {
			System.out.println(i);
			i++;
		}
		// Print 30 - 5
		int j = 30;
		while (j >= 5) {
			System.out.println(j);
			j--;
		}

		// Print A-Z Z-A and Alternate
		char ch1 = 'A';
		char ch2 = 'Z';
		while (ch1 <= 'Z') {

			System.out.println(ch1);
			ch1++;
		}

		// Print Z-A
		while (ch2 >= 'A') {
			System.out.println(ch2);
			ch2--;
		}

		// Alternate
		char ch3 = 'A';
		while (ch3 <= 'Z') {
			System.out.println(ch3);
			ch3 += 2;// ch3=ch3+2;

		}

	}

}
