package test_on_interface;

public class Car  extends Manufacture implements Vehicle {

	public Car(String name, String modelMame, String brand) {
		super(name, modelMame, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int maxSpeed() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public String manufactureInfo() {
		// TODO Auto-generated method stub
		return super.manufactureInfo();
	}

	


	

}
