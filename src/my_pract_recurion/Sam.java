package my_pract_recurion;

public class Sam {
	public static void main(String[] args) {
		System.out.println(a(2, 3));
	}
	static int a(int x,int y) {
		if(y==1) {
			return x;
		}
		else {
			return x + a(x, y-1);
		}
	}

}
