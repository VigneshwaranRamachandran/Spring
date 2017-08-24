package factoryStaticMethod;

public class CarFactory {
	public static String carname;

	public static void setCarname(String carname) {
		CarFactory.carname = carname;
	}

	public static Car getInstance() throws Exception {
		Benz c = (Benz) Class.forName(carname).newInstance();
		return c;
	}
}
