package my_practice_patterns;

public class HallowDaimond {
	public static void main(String[] args) {
		int row = 10;
		int sp = row - 1;
		int st = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				if (k == 1 || k == st) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (i < row / 2) {
				st += 2;
				sp = sp - 1;

			} else {
				sp++;
				st -= 2;
			}
		}
	}
}
