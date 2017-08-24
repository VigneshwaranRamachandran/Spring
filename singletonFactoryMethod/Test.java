package singletonFactoryMethod;

public class Test {
private static Test t;

public Test() {
	super();
	System.out.println("test object created");
}
public static Test getInstance(){
	if(t==null){
		t=new Test();
		return t;
	}
	else{
		return t;
		
	}
	
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	throw new CloneNotSupportedException();
	}
}
