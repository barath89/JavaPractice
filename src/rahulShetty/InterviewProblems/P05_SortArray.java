package rahulShetty.InterviewProblems;

public class P05_SortArray {

	public static void main(String[] args) {
		 int a[] = {3,5,2,1,6}; //1,2,3,5,6
		 int temp;
		 for(int i=0; i<a.length; i++) {
			 for(int j =i+1; j<a.length; j++) {
				 
				 if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				 }
			 }
			
			 
		 }
		 for(Object c :a) {
			 System.out.print(c);
		 }

	}

}
