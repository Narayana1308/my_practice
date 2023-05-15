package my_practice_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSettt {

	public static void main(String[] args) {
		TreeSet<Employe> employes = new TreeSet<>();
		Employe employe = new Employe();
		employe.setName("natraua");
		employe.setId(201);
		employe.setAddress("kadapa");
		Employe employe1 = new Employe();
		employe1.setName("natra");
		employe1.setId(102);
		employe1.setAddress("kada");
		employes.add(employe);
		employes.add(employe1);
//		System.out.println(employes);
//		for (Employe employe2 : employes) {
//			System.out.println(employe2.getId());
//		}
		
//		
		
		
		List<Employe> list=new ArrayList<>(employes);
		for (Employe employe2 : list) {
		System.out.println(employe2.getId());
	}
	}
}
