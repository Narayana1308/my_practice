package my_practice_array;

public class Ordeerrr {
	public static void main(String[] args) {
		int a[]= {112,32,63,2};
		int b[]= {9,5,2,25};
		
		Ordeerrr ordeerrr=new Ordeerrr();
		int r[]= ordeerrr.sortOrder(b);
		int s[]=ordeerrr.sortOrder(a);
		
		int result[]=new int[r.length+ s.length];
		
		int index=0;
		for(int i=0;i<result.length;i++) {
			
			for(int j=i+1;j<result.length;j++) {
//				if(r[i]==s[j]) {
//					
//				}
				
			}
			
			
		}
		System.out.println();
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
			
		}
		
		
		
		
		
	}
	public int[] sortOrder(int[]a) {
		//int []c=new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}

}
