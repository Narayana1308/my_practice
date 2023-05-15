package my_practice_string;

import java.util.Scanner;

public class Phone {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String phone=scanner.next();
		
//		if(phone.matches("[6-9][0-9]{9}")) {
//			System.out.println("valid");
//		}else {
//			System.out.println("invalid");
//			
//		}
		if(phone.matches("[a-zA-Z0-9_.]*@gmail[.]com"))
		{
			System.out.println("valllll");
		}
	}

}
