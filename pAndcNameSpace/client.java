package pAndcNameSpace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class client {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("pAndcNameSpace/spring.xml");
		Car ca=(Car)ac.getBean("d");
		ca.display();
	}

}
