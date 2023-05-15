package my_practice_Collection;

import java.util.Comparator;
import java.util.Objects;

public class Employe implements Comparable<Employe> {
	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Employe o) {
		Employe employe = (Employe) o;
		if (this.id == employe.id) {
			return 0;
		} else if (this.id > employe.id) {
			return 1;
		} else {
			return -1;
		}
	}
	

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


}
