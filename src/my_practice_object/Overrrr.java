package my_practice_object;

import java.util.Objects;

public class Overrrr {
	
	
	private int id;
	private String nameString;
	private long phone;
	private double s;
	@Override
	public int hashCode() {
		return Objects.hash(id, nameString, phone, s);
	}
	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Overrrr other = (Overrrr) obj;
		return id == other.id && Objects.equals(nameString, other.nameString) && phone == other.phone
				&& Double.doubleToLongBits(s) == Double.doubleToLongBits(other.s);
	}
	

}
