package constructorDependency;

public class Test {

	private int age;
	private String email;
	public Test(String name, int age, String email) {
		super();
		this.age = age;
		this.email = email;
	}
	public void hello(String name){
		System.out.println("name="+name+"age="+age+"email="+email);
	}

}
