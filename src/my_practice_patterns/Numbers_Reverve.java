package my_practice_patterns;

public class Numbers_Reverve {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i % 2 == 1) {
					System.out.print(k++ + " ");
				} else {
					System.out.print(k-- + " ");
				}
			}
			System.out.println();
			if (i % 2 == 1) {
				k += 9;
			} else {
				k = k + 11;
			}

		}
		//output
//		1 2 3 4 5 6 7 8 9 10 
//		20 19 18 17 16 15 14 13 12 11 
//		21 22 23 24 25 26 27 28 29 30 
//		40 39 38 37 36 35 34 33 32 31 
//		41 42 43 44 45 46 47 48 49 50 
//		60 59 58 57 56 55 54 53 52 51 
//		61 62 63 64 65 66 67 68 69 70 
//		80 79 78 77 76 75 74 73 72 71 
//		81 82 83 84 85 86 87 88 89 90 
//	    100 99 98 9796 95 94 93 92 91 
	}

}
