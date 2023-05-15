package my_practice_string;

public class RevEachWord {
	public static void main(String[] args) {
		String namString="my name is billa";
		String rev="";
		int k=0,j=0;
		for(int i=0;i<namString.length();i++) {
			k=i;
			while(i<namString.length() && namString.charAt(i)!=' ') {
				i++;
			}
			j=i-1;
			while(j>=k) {
				rev+=namString.charAt(j);
				j--;
			}
			if(i<namString.length() && namString.charAt(i)==' ') {
				rev+=namString.charAt(i);
			}
			System.out.println(rev);
		}
	}

}
