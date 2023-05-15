package my_practice_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListToMap {
	public static void main(String[] args) {
		List<Employe> list=new  ArrayList<>();
		Employe employe=new Employe();
		employe.setName("natraua");
		employe.setId(1019);
		employe.setAddress("kadapa");
		Employe employe1=new Employe();
		employe1.setName("natra");
		employe1.setId(102);
		employe1.setAddress("kada");
		list.add(employe1);
		list.add(employe);
		ArrayListToMap toMap=new ArrayListToMap();
		;
		System.out.println(toMap.saveEmp(list));
		Map<Integer, Employe> map=toMap.saveEmp(list);
		System.out.println(map);
//		Map<Integer, Employe> map=new HashMap<>();
//		map.put(1, employe1);
//		map.put(2, employe);
//		
//		Collection<Employe> set=map.values();
//		for(Employe employe2:set) {
//			System.out.println(employe2.getName()+" "+employe2.getAddress());
//		}
//		Map<Integer, Employe> mappMap=new HashMap<>();
	}
	public Map<Integer, Employe> saveEmp(List<Employe> employes){
		Map<Integer, Employe> map=new HashMap<>();
		for(Employe employe:employes) {
			map.put(employe.getId(), employe);
		}
		return map;
	}

}
