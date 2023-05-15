package test_on_interface;

public class Manufacture {
	private String name;
	private String modelMame;
	private String brand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModelMame() {
		return modelMame;
	}

	public void setModelMame(String modelMame) {
		this.modelMame = modelMame;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String manufactureInfo() {
		return name + "\n " + modelMame + "\n " + brand;
	}

	public Manufacture(String name, String modelMame, String brand) {
		super();
		this.name = name;
		this.modelMame = modelMame;
		this.brand = brand;
	}

}
