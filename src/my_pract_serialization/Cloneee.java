package my_pract_serialization;

import java.util.ArrayList;
import java.util.List;

public class Cloneee {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<Emp> list=new ArrayList<>();
		
		list.add(new Emp(1, "ds", "sd", "sd"));
		list.add(new Emp(2, "ds", "sd", "sd"));
		list.add(new Emp(3, "ds", "sd", "sd"));
		ArrayList<Emp> list2=(ArrayList<Emp>) list.clone();
		list2.get(0).setId(4);
		System.out.println(list.toString());
		
		
	}

}
