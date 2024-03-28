package practiceVersion2.ForLoop;

public class P06_PrintValueOf5Factorial {

	public static void main(String[] args) {
		//5! = 5x4x3x2x1
		int i;
		int fact =1;
		
		for(i=5; i>=1;i--) {
			
			fact=fact*i;
			
		}
		System.out.println(fact);

	}

}
