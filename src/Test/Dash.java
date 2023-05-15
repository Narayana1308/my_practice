 package Test;

public class Dash {
	public static String DashInsertII(int num) {
		String str=Integer.toString(num);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (i > 0) {
				char prev = str.charAt(i - 1);
				if (Character.isDigit(c) && Character.isDigit(prev)) {
					int currDigit = Character.getNumericValue(c);
					int prevDigit = Character.getNumericValue(prev);
					if (currDigit % 2 == 0 && prevDigit % 2 == 0&&(currDigit != 0 && prevDigit!=0)) {
						result.append("*");
					} else if (currDigit % 2 != 0 && prevDigit % 2 != 0) {
						result.append("-");
					}
				}
			}
			result.append(c);
		}
		return result.toString();
	}
	public static void main(String[] args) {
      System.out.println(DashInsertII(2113480890));
	}
}
