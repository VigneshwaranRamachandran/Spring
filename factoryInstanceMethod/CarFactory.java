package factoryInstanceMethod;

public class CarFactory {
	public String carname;

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public Car getInstance() throws Exception {
	
			Car c=(Benz) Class.forName(carname).newInstance();
			return c;
	}
}
