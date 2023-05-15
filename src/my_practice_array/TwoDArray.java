package my_practice_array;

import org.ietf.jgss.Oid;

public class TwoDArray {
	public static void main(String[] args) {
		int [][]a= {{1,2,3},{1,2,3},{1,2,3}};
		int [][]b= {{1,2,3},{1,2,3},{1,2,3}};
		
		
		int [][] c=new int [a.length][b[0].length];
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				int sum=0;
				for(int k=0;k<a[i].length;k++) {
					sum+=a[i][k]*b[k][j];
				}
				c[i][j]=sum;	
			}
		}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print( c[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
