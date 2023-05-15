package my_practice_string;

public class FormateString {
	public static void main(String[] args) {
		String name = "nrayana";

		StringBuffer buffer = new StringBuffer(name);

		for (int i = 0; i < buffer.length(); i++) {
			if (buffer.charAt(i) == 'a') {
				buffer.deleteCharAt(i);
			}
		}

		System.out.println(buffer);

	}

}
