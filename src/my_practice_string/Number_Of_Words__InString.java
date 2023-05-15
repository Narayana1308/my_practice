package my_practice_string;

public class Number_Of_Words__InString {
	public static void main(String[] args) {
		String sen="    My name is billla remo uh gy hg  ";
		int count=0;
		for(int i=0;i<sen.length();i++) {
			if(i==0&&sen.charAt(i)!=' '||i<=sen.length()-2&& sen.charAt(i)==' ' && sen.charAt(i+1)!=' ') {
				count++;
			}	
		}
		System.out.println(count);
	}

}
