package my_pract_stream;

import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import my_practice_Collection.Employe;

public class MainEmpp {
	public static void main(String[] args) {
		List<Emp> emps=new ArrayList<>();
		emps.add(new Emp(1, "ram", "ty", 21022));
		emps.add(new Emp(102, "sr", "y", 12000));
		emps.add(new Emp(21, "aka", "s", 1210));
		emps.add(new Emp(122, "sai", "ds", 1000));
		emps.add(new Emp(1212, "xavier", "ws", 200));
		
		
		emps.stream().sorted().forEach(System.out::println);
		
//		Collections.sort(emps);
//		System.out.println(emps);
		System.out.println();
		//emps.stream().sorted(new EmpName()).forEach(System.out::println);
		
		emps.stream().sorted((Emp e, Emp e1) ->{
			return e.getNameString().compareTo(e1.getNameString());
		}).forEach(System.out::println);
		//System.out.println(emps);

	}

}
