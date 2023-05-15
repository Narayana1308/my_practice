package my_practice_string;

public class ReplaceString {
	public static void main(String[] args) {
		
		//Adding the numbers from the given string
		
		String name="naAFrayana7678hjjh87iih89";
		String s1=name.replace('a', 's');
		String s2=name.replaceAll("[^0-9]", "");
		System.out.println(s2);
		System.out.println(s1);
	     int num=Integer.parseInt(s2);
	     int sum=0;
	     while(num>0) {
	    	int rem=num%10;
	    	sum=sum+rem;
	    	num/=10;
	     }
	     System.out.println(sum);
	}
	

}
