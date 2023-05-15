package test_on_interface;

public class Bike extends Manufacture implements Vehicle {
	//int A;

	public Bike(String name, String modelMame, String brand) {
		super(name, modelMame, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int maxSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String manufactureInfo() {
		// TODO Auto-generated method stub
		return super.manufactureInfo();
	}

	

}
