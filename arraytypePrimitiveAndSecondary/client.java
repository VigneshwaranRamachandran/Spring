package arraytypePrimitiveAndSecondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class client {
	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("arraytypePrimitiveAndSecondary/spring.xml");
	Car p=(Car)ac.getBean("t");
	p.display();
}
}
