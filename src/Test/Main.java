package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Emp> emps=new ArrayList<>();
		emps.add(new Emp(1, "hjjh"));
		emps.add(new Emp(12, "ajay"));
		emps.add(new Emp(67, "zXJ"));
		
		
		Collections.sort(emps,new Emp(2, "sdsd"));
		for(Emp emp:emps) {
			System.out.println(emp);
		}
	}

}
