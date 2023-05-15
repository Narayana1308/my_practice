package my_pract_basic;

public class NthPrimeNumber {
	public static void main(String[] args) {
	NthPrimeNumber number=new NthPrimeNumber();
	number.nth(3, 1, 20);
		
		
	}

	public void nth(int n,int st,int end) {
		int nth=0;
		for(int i=st;i<=end;i++) {
			int count=0;
			
			for(int j=1;j<=end;j++) {
				if(i%j==0) {
					//System.out.println(i);
					count++;
				}
				
			}
			if(count==2) {
				nth++;
				System.out.println(i+" "+nth);
			}
			if((nth)==n) {
				System.out.println(i+"  g");
				break;
			}
		
				
		}	
		
	}
}
