package rahulShetty.InterviewProblems;

public class P02_PrintMultiplicationTableWithoutUsingMultiplyOperator {

	public static void main(String[] args) {
		
		
		int multiplication = multiply(5,10); 
		
		System.out.println(multiplication);
	}

	private static int multiply(int i, int j) {

		int k=1 ; int sum=0;
		while(k<=j) {
			sum=sum+i;
			k++;
		}
		
		return sum;
	}

}
