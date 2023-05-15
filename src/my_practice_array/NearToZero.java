package my_practice_array;

public class NearToZero {
	public static void main(String[] args) {
		int [] aa= {19,12,3,4,-1};
		;
		System.out.println(near(aa));
		
	}
	public static int near(int[] a) {
		int re=2147483647;
		for(int i=0;i<a.length;i++) {
			if(re>a[i]&&a[i]>0) {
				re=a[i];
			}
		}
		return re;
		
		
	}

}
