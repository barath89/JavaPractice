package practiceVersion2.Arrays;

public class P05_CopyAnotherArray {

	public static void main(String[] args) {
		 int a[] = {2,3,4,5};
		 
		 for(int i = 0; i<a.length; i++) {
			  System.out.println(a[i]);
		 }
		 int b[] = new int[a.length];
		 
		 for(int j=0 ; j<a.length;j++) {
			 b[j]=a[j];
		 }
		 
		 for(int k=0; k< b.length; k++) {
			 
			 System.out.println(b[k]);
		 }

	}

}
