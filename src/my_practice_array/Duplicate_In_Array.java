package my_practice_array;

public class Duplicate_In_Array {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 4, 3, 5, 3, 9 };
		int[] b = new int[a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				b[k++] = a[i];
			}
		}
		for (int l = 0; l < k; l++) {
			System.out.println(b[l]);
		}
	}

}
