package my_practice_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpNameSorting implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Employe employe=(Employe)o1;
		Employe employe2=(Employe)o2;
		return employe.getName().compareTo(employe2.getName());
	}
	
//	public static void main(String[] args) {
////		List<Employe> list=new ArrayList<>();
////		Employe employe=new Employe();
////		employe.setName("Sarayana");
////		employe.setId(1019);
////		employe.setAddress("kadapa");
////		Employe employe1=new Employe();
////		employe1.setName("RAM");
////		employe1.setId(102);
////		employe1.setAddress("kada");
////		Employe employe2=new Employe();
////		employe2.setName("ZRAM");
////		employe2.setId(102);
////		employe2.setAddress("kada");
////		list.add(employe1);
////		list.add(employe);
////		list.add(employe2);
////		Collections.sort(list,new SortByEmpName());
////		System.out.println(list);
////		Collections.reverse(list);
////		System.out.println(list);
//	}

}
