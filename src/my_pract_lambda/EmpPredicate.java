package my_pract_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmpPredicate {

	public static void main(String[] args) {
		
		List<Emp> emps=new ArrayList<>();
		emps.add(new Emp(1, "sa", 1000));
		emps.add(new Emp(2, "sa", 21000));
		emps.add(new Emp(3, "sa", 3000));
		emps.add(new Emp(4, "sa", 4000));
           
		Predicate<Emp> e=emp-> emp.getSal()>=3000;
		
		for(Emp emp:emps) {
			
			if(e.test(emp)) {
				System.out.println(emp);
			}
			System.out.println();
		}
		
		
	}
}
