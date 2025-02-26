package basicsConditionalStatements;

import java.util.Scanner;

public class DivisibleBy3Or4 {

	private static Scanner sc;

	public static void main(String[] args) {
		int a;
		 sc = new Scanner(System.in);
			
			System.out.println("Enter the number");
			a=sc.nextInt();
			if((a%3)==0 || (a%4)==0) {
				System.out.println("Number is divisible by 3 Or 4");
			}
			else
				System.out.println("Number is not divisible by 3 Or 4");
		}

	}


