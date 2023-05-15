package my_pract_List;

import java.util.Set;
import java.util.TreeSet;

public class EmpMain {
	public static void main(String[] args) {
		Set<Emp> emps=new TreeSet<>();
		emps.add(new Emp(12, "anadh", "hjj"));
		emps.add(new Emp(1, "esawr", "eswar@123"));
		System.out.println(emps);
	}

}
