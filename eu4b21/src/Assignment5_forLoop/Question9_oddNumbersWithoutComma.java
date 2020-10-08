package Assignment5_forLoop;

public class Question9_oddNumbersWithoutComma {

	public static void main(String[] args) {
		
		int end=41;
		String comma = "";
		
		int i=1;		
		while (i<=end) {
			
			if (i%2!=0) {
				
				System.out.print(comma + i);
				comma = ",";
								
			}
			
			i++;
			
		}

	}

}
