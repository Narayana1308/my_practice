package test_on_interface;

public class VehicleFactory {
	public Vehicle getVehicle(Vehicle object) {
		if(object instanceof Car) {
			
			return new Car("aa", "aa", "m");
		}else {
			return new Bike("mk", "mk", "nj");
		}
		
	}

}
