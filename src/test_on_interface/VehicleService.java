package test_on_interface;

import java.util.Scanner;

public class VehicleService {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		VehicleFactory factor=new VehicleFactory();
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:{
			Car car=new Car("aas", "aa", "jkj");
			System.out.println(car.manufactureInfo());
			Car vehicle= (Car) factor.getVehicle(car);
			
			System.out.println(vehicle.maxSpeed());
			System.out.println(vehicle.manufactureInfo());
			
		}break;
		case 2:{
			Car vehicle=(Car) factor.getVehicle(new Car(null, null, null));
			
			System.out.println(vehicle.maxSpeed());
			System.out.println(vehicle.manufactureInfo());
			
		}break;
		}
		
		
		
	}

}
