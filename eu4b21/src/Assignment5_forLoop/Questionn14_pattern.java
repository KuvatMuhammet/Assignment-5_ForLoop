package Assignment5_forLoop;

public class Questionn14_pattern {

	public static void main(String[] args) {
		
		int raws=7;
		
		for (int i=1; i<=raws; i++) {
							
			for (int j=1; j<=i; j++) {
					
				if (j==1) {
					System.out.print("#");
					
				}else {
					System.out.print(" ");
				}
								
			}
				System.out.println("#");
		}

	}

}
