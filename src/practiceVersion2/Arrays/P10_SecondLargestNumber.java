package practiceVersion2.Arrays;

public class P10_SecondLargestNumber {

	public static void main(String[] args) {
		int a[] = {3,4,35,9,90};
		
		int max=a[0];
		int secMax = a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i]>max) {
				secMax =max;
				max=a[i];
				
			}
			else if(a[i]>secMax) {
				secMax = a[i];
				
			}
			
		}
		System.out.println("Max Value : "+max);
		System.out.println("Second Max : "+secMax);
	}

}
