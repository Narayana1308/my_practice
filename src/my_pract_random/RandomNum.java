package my_pract_random;

import java.util.Iterator;
import java.util.Random;

public class RandomNum {
	public static void main(String[] args) {
		int a[] = new int[10];

		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(11);
			System.out.print(a[i]+ " ");
		}

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}

		System.out.println(max);
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}

		System.out.println(min);
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					b[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
		
		
	}

}
