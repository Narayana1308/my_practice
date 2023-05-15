package Mar03;

import java.sql.Struct;

public class TestOnArray {
	public int largest(int n,int [] num) {
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}		
		}
       return num[n-1];
	}
	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		
		TestOnArray array=new TestOnArray();
		System.out.println(array.largest(2, a));
		String sen="my name is billa";
		String[] s1=sen.split(" ");
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1;j<s1.length;j++){
				if(s1[i].length()==s1[j].length()) {
				s1[j]=s1[j].replace(s1[j], " ");
				}
				
			}		
		}
		System.out.println(sen);
		String sr[]=sen.split(" ");
		String ss=" ";
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<sr.length;j++) {
				if(s1[i].equals(sr[j]) ){
					ss=ss+s1[i];
				}
			}
		}
		System.out.println(ss);
		String string="my name is billa";
		String[] rev=string.split(" ");
		String string2="";
		for(int i=0;i<rev.length;i++) {
			//System.out.println(rev[i]+" "+rev[i].length());
			System.out.println(rev[i]);
			for(int j=rev[i].length()-1;j>=0;j--) {
				string2+=rev[i].charAt(j);
			}
			System.out.println(string2);
			string2="";
			
		}
		
		
	}

}
