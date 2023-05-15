package my_practice_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ArrayListToTreeset {
	public static void main(String[] args) {
		List<Employe> list=new ArrayList<>();
		Employe employe=new Employe();
		employe.setName("natraua");
		employe.setId(1101);
		employe.setAddress("kadapa");
		Employe employe1=new Employe();
		employe1.setName("akanda");
		employe1.setId(102);
		employe1.setAddress("ada");
		Employe employ1=new Employe();
		employ1.setName("akanda");
		employ1.setId(102);
		employ1.setAddress("ada");
		list.add(employe1);
		list.add(employ1);
		list.add(employe);
		TreeSet<Employe> tre=new TreeSet<>(list);
		System.out.println(tre);
		for(Employe employe2:tre) {
			System.out.println(employe2.getId());
			System.out.println(employe2.getName());
			System.out.println(employe2.getAddress());
		}
	}

}
