package basicsForLoopStatement;

import java.util.Scanner;

public class MultiplicationTable {

	private static Scanner sc;

	public static void main(String[] args) {
	sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println("Enter a number "+number+"*"+i+"=" +number*i);
			
		}

	}

}
