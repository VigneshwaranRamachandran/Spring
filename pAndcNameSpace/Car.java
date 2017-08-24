package pAndcNameSpace;

public class Car {
	private String carName;
	private Engine engine;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void display() {
		System.out.println(carName);
		System.out.println(engine.getModelYear());
	}
}
