package practiceVersion2.ForLoop;



public class P04_PrintSumOfAllEvenNumberBetween1To15 {

	public static void main(String[] args) {
		int sum =0;
		for(int i =1 ; i<=30; i++) {
			
			if(i%2==0) {
				sum = sum+i;
			}
			
		}
		System.out.println(sum);
	}

}
