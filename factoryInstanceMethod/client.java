package factoryInstanceMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class client {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("factoryInstanceMethod/spring.xml");
		Car ca=(Benz)ac.getBean("c");
		ca.drive();
		
	}

}