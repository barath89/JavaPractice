package basicsForLoopStatement;

import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34
		
		int n1=0,n2=1, sum = 0;
		
		System.out.print(n1+ " "+ n2 +" " );
		
		for(int i = 1; i<=10;i++) {
			
			sum=n1+n2;
			
			System.out.print(sum +" ");
			n1=n2;
			n2=sum;
		}
		
		//Using Java8
//		Stream.iterate(new int[] {0,1}, t -> new int[] {t[1],t[0] + t[1]})
//		.limit(10).map(t->t[0]).forEach(x->System.out.println(x));
		
		Stream.iterate(new int[] {0,1}, t -> new int[] {t[1],t[0] + t[1]}).map(t->t[0]).limit(10).forEach(x->System.out.println(x));
		
	}

}
