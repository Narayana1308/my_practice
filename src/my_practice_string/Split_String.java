package my_practice_string;

public class Split_String {
	public static void main(String[] args) {
		String sentence="anantha narayana from kadapa ";
		String [] split=sentence.split(" ");
		for(String name:split) {
			//System.err.println(name);
		System.out.println(name+" "+name.length());
		}
		StringBuffer buffer=new StringBuffer(sentence);
		System.out.println(buffer.reverse());
//		StringBuilder builder=new StringBuilder(sentence);
//		System.out.println(builder.reverse());
		for(int i=0;i<split.length;i++) {
			String s=split[i];
			System.out.println(s+ " "+s.length());
		}
		
	}

}
