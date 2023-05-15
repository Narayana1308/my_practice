package my_practice_enum;

public class MonthMain {
	public static void main(String[] args) {
		Month month=Month.decem;
		switch (month) {
		case jan:
			System.out.println("january");
			break;

		default:
			System.out.println("invalid");
			break;
		}
	}

}
