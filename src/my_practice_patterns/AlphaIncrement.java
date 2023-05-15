package my_practice_patterns;


public class AlphaIncrement {
	
	public static void main(String[] args) {
		
		char ch='a';
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i<=j){
					System.out.print(ch++ );
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			ch='a';
		}
	}

}
// o/p

//abcde
//abcd
// abc
//  ab
//   a
