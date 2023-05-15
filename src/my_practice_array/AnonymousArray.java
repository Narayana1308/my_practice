package my_practice_array;

public class AnonymousArray {
	public static void main(String[] args) {
		int[] a = new int[] { 12, 22, 33, 33 };
//	a[0]=8;
//	a[1]=7;
		sumone(a);
		sumTwo(new int[][] {{12,3,34,55},{12,12,22}});
        sumThree(new int[][][] {{{1,2,3},{1,2,3},{1,2,3}}});
		
	}

	public static void sumone(int[] a) {
		int total = 0;
		for (int i : a) {

			total += i;
		}
		System.out.println(total);
	}

	public static void sumTwo(int[][] a) {
		int total = 0;
		for (int j[] : a) {
			for (int i : j) {
				total += i;
			}
		}
		System.out.println(total);
	}

	public static void sumThree(int[][][] a) {
		int total = 0;
		for (int i[][] : a) {
			for (int j[] : i) {
				for (int k : j) {

					total += k;
				}
			}
		}
		System.out.println(total);
	}

}
