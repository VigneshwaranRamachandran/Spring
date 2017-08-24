package dependsOn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext ac=new ClassPathXmlApplicationContext("dependsOn/spring.xml");
	}

}
