package Assignment5_forLoop;

public class Question1_setOfNumbers {

	public static void main(String[] args) {
		
		String comma = "";
		
		for (int i=0; i<=1000; i +=10) {
			
			System.out.print(comma + i);
			comma=",";
		}
		
	}

}
