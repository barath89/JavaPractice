package basicsConditionalStatements;

public class GreatestOfThree {

	public static void main(String[] args) {
		
		int a=100, b=27, c=60,largest,temp;
		
		//variable_name = (expression) ? value if true:value if false
		//largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b); 
		
		temp = a>b?a:b;
		
		largest=c>temp?c:temp;
		System.out.println(largest);
		
		
		}

	}


