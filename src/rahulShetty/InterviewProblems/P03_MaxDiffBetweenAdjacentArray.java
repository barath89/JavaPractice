package rahulShetty.InterviewProblems;

public class P03_MaxDiffBetweenAdjacentArray {

	public static void main(String[] args) {
		
		int a[]= {1,5,8,10,16}; // 4, 3, 2, 6
		int diff = 0;
		for(int i=0; i<a.length-1;i++) {
			
			if(a[i+1]-a[i]> diff) {
				diff = a[i+1]-a[i];
			}
			
		}
System.out.println(diff);
	}

}
