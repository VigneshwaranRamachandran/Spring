package steriotypeAndNamedtypeAnnotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

public class Car2 {
	@Resource
private Engine engine;


public void display(){
	System.out.println("sucess..."+engine.name);
}
}
