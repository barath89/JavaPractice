package practiceVersion2.WhileLoop;

public class P06_ArmstrongNumber {

	public static void main(String[] args) {
		
	//	Any Number add Cube and Add will give same number 
	// 153 = 1^3 + 5^3 + 3^3 = 1 + 125 +127 = 153
		
		int number = 153, reminder,reverse=0,temp=number;
		
		while (number>0) {
			
			reminder = number%10;
			number = number /10;
			reverse = reverse+(reminder*reminder*reminder);
			
		}
		System.out.println("Reverse Number" +reverse);
		if(temp==reverse) {
			System.out.println("Given Number is a Armstrong Number");
		}
		else {
			System.out.println("Given Number is not an Armstrong Number");
		}

	}

}
