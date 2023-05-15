package Test;

import java.util.Arrays;

public class Arra {
	public static void main(String[] args) {
		int [] num= {3,4,4,66,64,4,6};
		int []a=new int[num.length];
		int k=0;
		
		for(int i=0;i<num.length;i++) {
			int count=0;
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]==num[j]) {
					count++;		
					
				}
			}
			if(count==0) {
			a[k++]=num[i];
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		Arrays.sort(a);
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int n=3;
		System.out.println(a[a.length-n]);
		
		
		
	}

}
