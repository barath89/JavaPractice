package rahulShetty.InterviewProblems;

import java.util.ArrayList;

public class P04_PrintMatchingIndexOfSameArrayElements {

	public static void main(String[] args) {
		
		int a[] = {2,5,7,1};
		int b[] = {4,5,6,1};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			
			if(a[i] == b[i]) {
				al.add(a[i]);
			}
			
			
		}
		for(Integer e:al) {
			System.out.println(e);
		}

	}

}
