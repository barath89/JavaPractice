package practiceVersion2.Arrays;

public class P12_PrintMissingNumberFrom1To100 {

	public static void main(String[] args) {

		int a[] = {3,5,2,7,4};
		boolean status =true;
		for(int j=1; j<=10; j++) {
			
			for(int i=0; i<a.length; i++) {
				
				if(j==a[i]) {
					status=false;
					break;
					}
				}
			if(status==true) {
				System.out.println(j);
			}
			status=true;
			
		}

	}

}
