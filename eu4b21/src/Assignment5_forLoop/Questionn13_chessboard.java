package Assignment5_forLoop;

public class Questionn13_chessboard {

	public static void main(String[] args) {
		
		int raws = 8;
		int columns = 8;
				
		for (int i=1; i<=raws; i++) {
			
			for (int j=1; j<=columns; j++) {
					
				int sum = 0;
				sum = i + j;
				if (sum%2==0) {
					System.out.print("B ");
				}else if (sum%2!=0) {
					System.out.print("W ");
				}
					
			}				
				System.out.println();
			
		}

	}

}
