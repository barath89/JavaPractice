package practiceVersion2.Arrays;

public class P11_SecondSmallestNumber {

	public static void main(String[] args) {
		int a[] = {45,33,4,23,12};
		
		int min = a[0];
		int secMin = a[0];
		
		for(int i=1; i<a.length ; i++) {
			
			if(a[i]<min) {
				secMin=min;
				min=a[i];
			}
			else if(a[i]<secMin) {
				secMin=a[i];
				
			}
			
		}
		
System.out.println("Minimum Value : "+min);
System.out.println("Second Minimum : "+secMin);
	}

}
