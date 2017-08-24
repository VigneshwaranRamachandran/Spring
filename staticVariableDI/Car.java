package staticVariableDI;

public class Car {

	private static String name;

	private static void setName(String name) {
		Car.name = name;
	}
	public static void display(){
		System.out.println("carname:"+name);
	}
}
