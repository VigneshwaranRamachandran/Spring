package defaultCollectionDatatype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class client {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("defaultCollectionDatatype/spring.xml");
		Test t=(Test)ac.getBean("t");
		t.display();
	}

}
