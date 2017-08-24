package methodReplaacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("methodReplaacer/spring.xml");
	bank b=(bank)ac.getBean("b");
	b.calInt();
	b.deposite();
	b.withdraw();
	}
}
