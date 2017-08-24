package staticVariableDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class client {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("staticVariableDI/spring.xml");
	ac.getBean("c");
		Car.display();
		//ResourceBundle a = new ResourceBundle();
	}

}
