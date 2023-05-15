package my_practice_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MapEmployee {
	public static void main(String[] args) {
		HashMap<String, Employe> map = new HashMap<>();
		map.put("zbc", new Employe(15665, "dd", "dwsdsd"));
		map.put("sds", new Employe(12, "add", "sdsd"));
		//System.out.println(map);
		
		//Set set = map.keySet();
		Collection<Employe> collection=map.values();
		List<Employe> employes=new ArrayList<>(collection);
		Collections.sort(employes,new EmpNameSorting());
		for(Employe employe:employes) {
			System.out.println(employe);
		}
		//collection.stream().sorted().forEach(System.out::println);
		
		//List<Employe> employes = new ArrayList<>();
	}

}
