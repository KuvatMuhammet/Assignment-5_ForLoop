package Assignment5_forLoop;

public class Question6_fibonacci {

	public static void main(String[] args) {
		
		int n=20;
		int firstNumber=0;
		int nextNumber=1;
				
		System.out.println("Fibonacci series of " + n + " numbers:");
		
		int i=1;
		while (i<=n) {
			System.out.print(firstNumber + " ");
			int sum = firstNumber + nextNumber;
			firstNumber = nextNumber;
			nextNumber = sum;
			i++;
		}
		
	}

}
