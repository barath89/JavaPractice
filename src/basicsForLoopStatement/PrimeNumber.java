package basicsForLoopStatement;

public class PrimeNumber {

	public static void main(String[] args) {
		//NUmber Divisible by itself eg 2,3,5,7,11,13,17,19
		int number= 5;
		boolean flag =true;
		
		for(int i=2; i<number; i++) {
			if(number%i==0) {
			flag=false;
			break;
			}
		}
		if(flag == true) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}

	}

}
