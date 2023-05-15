package my_practice_string;

public class ReverseName {
	public static void main(String[] args) {
		String name="Narayana";
		String rev="";
		String var="";
		String rev1="";
		String var1="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch>='A'&&ch<='Z'||ch<='a'&& ch>='z') {
				rev=rev+ch;
				var=rev.toLowerCase();
			}else  {
				rev1=rev1+ch;
				var1=rev1.toUpperCase();
			}
		}
		System.out.println(var.concat(var1));
	}

}
