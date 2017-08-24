package autowireByAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Car {
	@Qualifier(value="e1")
	@Autowired()
private Engine engine;

public void display(){
	System.out.println(engine.getModelYear());
}
}
