package basicsForLoopStatement;

public class PrintJavaInLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Java");

		}
		System.out.println("------------------------------------");
		System.out.println("Print1-100");
		// Print 1-100
		for (int j = 1; j <= 100; j++) {
			System.out.println(j);
		}
		System.out.println("------------------------------------");
		System.out.println("Print 65-35");
		// Print 65-35
		for (int k = 65; k >= 35; k--) {
			System.out.println(k);
		}
		System.out.println("------------------------------------");
		System.out.println("Print Even numbers from 1-30");
		// Print Even numbers from 1-30

		for (int l = 1; l <= 30; l++) {
			if ((l % 2) == 0) {
				System.out.println(l);
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("Print Even numbers from 1-15 and Sum");
		// Print even numbers and sum
		int sum = 0;
		for (int m = 1; m <= 15; m++) {
			if ((m % 2) == 0) {
				sum = sum + m;
			}
		}
		System.out.println(sum);
		System.out.println("------------------------------------");
		
		System.out.println("Print Even numbers from 1-30 and multiply");
		//Print Even numbers and multiply
		int product=1;
		for(int n=1;n<=10;n++) {
			if(n%2==0)
				product=product*n;
			}
		System.out.println(product);
		System.out.println("------------------------------------");
		
	}

}
