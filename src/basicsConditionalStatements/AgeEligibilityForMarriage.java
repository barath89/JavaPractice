package basicsConditionalStatements;

public class AgeEligibilityForMarriage {

	public static void main(String[] args) {
		
		//girlAge>18 boyAge>21
		
		int boyAge=21;
		int girlAge=18;
		if(boyAge>=21 && girlAge>=18) {
			System.out.println("Couples Eligible for marriage");
		}
		else {
			System.out.println("Couples not Eligible for marriage");
		}

	}

}
