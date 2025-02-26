package basicsForLoopStatement;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a =10,aa=10;
		int b =20,bb=20;
		int temp;
		//Using temp
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Using Temp "+a + " " +b);

		aa=aa+bb; //30
		bb= aa-bb;//10
		aa=aa-bb;
		
		System.out.println(a + " " +b);
	}

}
