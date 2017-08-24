package steriotypeAndNamedtypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class client {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("steriotypeAndNamedtypeAnnotation/spring.xml");
		Car t=(Car)ac.getBean(Car.class);
		t.display();
	}

}