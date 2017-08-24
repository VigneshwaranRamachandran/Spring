package factoryStaticMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("factoryStaticMethod/spring.xml");
		Benz ca=(Benz)ac.getBean("cfg");
		ca.drive();
		
	}

}