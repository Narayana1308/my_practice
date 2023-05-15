package my_practice_string;

public class Remove_Duplicates {
	//removing duplicates in an string
	public static void main(String[] args) {
		String name = "narayana anantha";
		String remove = "";
		int i, j;
		for (i = 0; i < name.length(); i++) {
			for (j = 0; j < i; j++) {
				if (name.charAt(i) == name.charAt(j)) {

					break;
				}
			}
			if (i == j) {
				remove += name.charAt(i);
			}
		}
		System.out.println(remove);
	}

}
