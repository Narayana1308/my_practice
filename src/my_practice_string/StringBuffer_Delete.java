package my_practice_string;

public class StringBuffer_Delete {
	public static void main(String[] args) {
		
		String string=new String("hi my name is billa ");
		StringBuffer buffer=new StringBuffer();
		buffer.append(string);
		
		for(int i=0;i<buffer.length();i++) {
			if(buffer.charAt(i)=='a'||buffer.charAt(i)=='e'||buffer.charAt(i)=='o'||buffer.charAt(i)=='u'||buffer.charAt(i)=='i') {
				buffer.deleteCharAt(i);
			}
		}
		System.out.println(buffer);
	}

}
