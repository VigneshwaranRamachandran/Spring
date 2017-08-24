package singletonFactoryMethod;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
	public static void main(String[] args){
	ApplicationContext ac=new ClassPathXmlApplicationContext("singletonFactoryMethod/spring.xml");
	Test  t1 = (Test)ac.getBean("t");
	Test  t2 = (Test)ac.getBean("t");
	Calendar c1=(Calendar)ac.getBean("c");
	Calendar c2=(Calendar)ac.getBean("c");
	System.out.println(t1==t2);
	System.out.println(c1==c2);
}
}