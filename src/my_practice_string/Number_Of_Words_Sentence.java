package my_practice_string;



public class Number_Of_Words_Sentence {
	// counting the number of letters in each word in an sentence
	public static void main(String[] args) {
		String sen = "my name is billa";
		sen = " " + sen + " ";
		String a="";
		int count = 0;
		int c=0;
		for (int i = 0; i < sen.length(); i++) {
			count++;
			a+=sen.charAt(i);
			if (sen.charAt(i) == ' ') {
				
				if (count != 1) {
					//System.out.println(a);
					System.out.println(a+" "+(count - 1));
					a="";
					c++;
				}
				count = 0;
			}

		}
		System.out.println(c);
	}

}
