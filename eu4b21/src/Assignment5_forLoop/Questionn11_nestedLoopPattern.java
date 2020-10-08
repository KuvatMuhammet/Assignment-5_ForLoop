package Assignment5_forLoop;

public class Questionn11_nestedLoopPattern {

	public static void main(String[] args) {

		int raws = 4;

		int m = raws; 
		for (int i = 1; i <= raws; i++) {
			
			for (int x = 1; x < i; x++) {
				System.out.print("  ");
			}
			
			for (int j = m; j >= 1; j--) {

				System.out.print(j + "   ");
			}

			System.out.println();
			m--;
			
		}
	}

}
