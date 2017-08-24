package programaticBeanLifeCycle;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) throws Exception {
	ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("programaticBeanLifeCycle/spring.xml");
	while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("1 for save or else close");
		int i=sc.nextInt();
		switch (i) {
		case 1:
			Test t=(Test)cap.getBean("t");
			System.out.println("id");
			int id=sc.nextInt();
			System.out.println("name");
			String name=sc.next();
			t.save(id, name);
			break;

		default:
			cap.close();
			break;
		}
	}
}
}
