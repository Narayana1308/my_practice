package my_practice_patterns;



public class Number_Pattern {

	public static void main(String[] args) {
//		const int a=10;
//		System.out.println(a);

		int n = 5;
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j <= 4; j++) {
				System.out.print((5 * j + n) + " ");

			}

			System.out.println();
			n--;
		}
	}

}
