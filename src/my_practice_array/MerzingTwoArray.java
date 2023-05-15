package my_practice_array;

public class MerzingTwoArray {
	public static void main(String[] args) {
		
		//merzing two array into new array
		
		int[] a = { 1, 2, 4, 3, 44 };
		int[] b = { 9, 2, 8, 7, 5 };
		int[] c = new int[a.length + b.length];
		int k = 0;
		for (int i = 0; i < c.length; i++) {
			if (i < a.length) {
				c[i] = a[i];
			} else {
				c[i] = b[k++];
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");

		}
		System.out.println();
		
		
		//asceding order for the given array
		
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if (c[i] > c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");

		}
		System.out.println();
		//Removing the duplicate elements in the array
		
		int [] s=new int [c.length];
		int index=0;
		for(int i=0;i<s.length;i++) {
			int count=0;
			for(int j=i+1;j<s.length;j++) {
				if(c[i]==c[j]) {
					count++;
				}
			}
			if(count==0) {
				s[index++]=c[i];
			}
		}
		for (int i = 0; i < index; i++) {
			System.out.print(s[i] + " ");

		}
		
	}

}
