package PattanJava;

public class Pattern14 {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;

		for (int i = 0; i <= row; i++) {

			for (int k = 0; k < col; k++) {
				System.out.print(" * ");

			}
			col--;

			System.out.println();
		}

	}

}