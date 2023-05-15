package my_practice_enum;

public class EquallEnum {
	public static void main(String[] args) {
//	if	(Month.jan==Month.jan) {
//		System.out.println("gh");
//	}else {
//		System.out.println("sdsd");
//	}
//		if	(Month.jan.equals(Month.jan) ){
//			System.out.println("gh");
//		}else {
//			System.out.println("sdsd");
//		}
		boolean b=Month.jan.equals(Month.jan);
		boolean c=Month.jan==Month.jan;
		System.out.println(b);
		System.out.println(c);
		Month month =Month.decem;
		System.out.println(month);
	}

}
