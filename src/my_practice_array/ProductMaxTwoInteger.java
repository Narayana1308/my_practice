package my_practice_array;

public class ProductMaxTwoInteger {
	public static void main(String[] args) {
		int a[]= {9,8,9};
		int max=0;
		for(int i=0;i<a.length;i++) {
			int pro=1;
			for(int j=i+1;j<a.length;j++) {
				pro=a[i]*a[j];
				if(pro>max) {
					max=pro;
				}
			}
		}
		System.out.println(max);
	}

}
