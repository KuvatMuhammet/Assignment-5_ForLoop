package Assignment5_forLoop;

public class Question8_calculateTheSum {

	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		int upperBound=100;
		
		while (i<=upperBound) {
			
			sum=sum+i;
			i++;
			
		}
		
		System.out.println("Sum of the numbers from 1 to upper bound is:");
		System.out.println("-----");
		System.out.println(sum);

	}

}
