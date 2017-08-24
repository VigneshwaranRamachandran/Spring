package autowireByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class client {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("autowireByAnnotation/spring.xml");
		Car ca=(Car)ac.getBean("d");
		ca.display();
	}

}
