package lookUpMethodDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("lookUpMethodDI/spring.xml");
		CarInterface c=(CarInterface)ac.getBean("c");
//		BusAbstract b =(BusAbstract)ac.getBean("b");
//		TrukConcreate t=(TrukConcreate)ac.getBean("t");
		System.out.println(c.myCarEngine().getName());
		
System.out.println(c.myCarEngine().myCarEngine());
	}

}
