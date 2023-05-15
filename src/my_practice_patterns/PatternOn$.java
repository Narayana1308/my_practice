package my_practice_patterns;

public class PatternOn$ {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) {                            //output
					if (j % 2 == 0)                          // $*$*$
						System.out.print("$");               // *$*$*
					else                                     // $*$*$
						System.out.print("*");               // *$*$*
				} else {                                     // $*$*$
					if (j % 2 == 1)
						System.out.print("$");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
