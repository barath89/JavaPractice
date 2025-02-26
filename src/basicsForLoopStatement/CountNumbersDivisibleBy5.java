package basicsForLoopStatement;

public class CountNumbersDivisibleBy5 {

	public static void main(String[] args) {
		//Count numbers between 1-30 divisible by 5
		int num=5;
		int count=0;
		
		for(int i=1; i<=30; i++) {
			if((i%num)==0) {
				count=count+1;
			}
			
		}
		System.out.println(count);

	}

}
