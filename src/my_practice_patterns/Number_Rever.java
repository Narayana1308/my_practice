package my_practice_patterns;

public class Number_Rever {
	public static void main(String[] args) {

		int k = 5;
		int n = k;
		for (int i = 1; i <= 5; i++) {
			k = n;
			for (int j = 0; j <= 5; j++) {
				System.out.print(k + " ");
				k += 5;

			}
			System.out.println();
			n--;

		}
//		int k=2;
//		int n=k;
//		for(int i=1;i<=5;i++) {
//			k=n;
//			for(int j=0;j<=5;j++) {
//				System.out.print(k+" ");
//				k+=2;
//				
//			}
//			System.out.println();
//			n+=2;	
//		}

		// output
//		2 4 6 8 10 12 
//		4 6 8 10 12 14 
//		6 8 10 12 14 16 
//		8 10 12 14 16 18 
//		10 12 14 16 18 20 
	}

}
