package propertiesFileDI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("propertiesFileDI/spring.xml");
		Car c=(Car)ac.getBean("c");
		c.display();
		System.out.println(c.age);
		System.out.println(c.name);

	}

}
