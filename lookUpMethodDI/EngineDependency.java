package lookUpMethodDI;

public class EngineDependency {
private String name;

public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public String myCarEngine(){
EngineDependency e=new EngineDependency();
e.setName("Interface");
System.out.println("inside override method");
return name;
}
}