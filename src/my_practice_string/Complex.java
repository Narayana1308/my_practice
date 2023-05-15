package my_practice_string;

public class Complex {
	public static void main(String[] args) {
		String word = "10j82k";
		int num = 2;
		// System.out.println("mk");
		for (int i = 1; i < word.length(); i++) {
			String s = "";
			while (i < word.length() && (word.charAt(i - 1) > 47) && (word.charAt(i - 1) < 58)) {
				s += word.charAt(i - 1);
				i++;
			}
			if (word.length() > 0) {

				int num1 = Integer.parseInt(s);
				if (num1 % num1 == 0) {
					for (int j = 0; j < num1 / num; j++) {
						System.out.print(word.charAt(i - 1));
					}
				} else {
					for (int j = 0; j < num; j++) {
						System.out.print(word.charAt(i - 1));
					}

				}
			}

		}
	}

}
