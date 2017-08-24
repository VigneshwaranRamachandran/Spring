package steriotypeAndNamedtypeAnnotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component
public class Car {
	@Resource
private Engine engine;


public void display(){
	System.out.println("sucess..."+engine.name);
}
}
