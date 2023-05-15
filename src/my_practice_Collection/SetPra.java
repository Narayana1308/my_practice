package my_practice_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPra {
	public static void main(String[] args) {
		Set<Employe> hashSet=new HashSet<>();
		Employe employe=new Employe();
		employe.setName("natraua");
		employe.setId(1019);
		employe.setAddress("kadapa");
		Employe employe1=new Employe();
		employe1.setName("natra");
		employe1.setId(102);
		employe1.setAddress("kada");
        hashSet.add(employe);
        hashSet.add(employe1);
       
        List<Employe> list=new ArrayList<>(hashSet);
        Collections.sort(list);
        for(Employe employe2:list) {
        	System.out.println(employe2.getId());
        }
		
	}

}
