package geekForGeeks;

public class Panagram {

	public static void main(String[] args) {
		String str = "ABcdefghijk23lmnopqrsuvwxyz";
		
		str=str.toUpperCase();
		
		boolean isPresent = true;

		for(char ch='A';ch<'Z';ch++) {
			
			if(!str.contains(String.valueOf(ch))) {
				isPresent=false;
				break;
			}
		}
		if(isPresent) {
			System.out.println("YES");
		}
		else {
			System.out.println("No");
		}

	}

}
