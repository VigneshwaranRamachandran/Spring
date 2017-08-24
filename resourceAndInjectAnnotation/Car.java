package resourceAndInjectAnnotation;

import javax.annotation.Resource;

public class Car {
	@Resource
private Engine engine;


public void display(){
	System.out.println("sucess...");
}
}
