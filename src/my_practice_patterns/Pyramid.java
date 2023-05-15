package my_practice_patterns;

public class Pyramid {
	public static void main(String[] args) {
		int row = 10;
		int sp = row - 1;
		int st = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < st; k++) {
				System.out.print("*");
			}
			System.out.println();
			sp -= 1;
			st += 2;
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (j == row-1) {

					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}

}
