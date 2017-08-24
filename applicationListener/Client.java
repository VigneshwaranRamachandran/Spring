package applicationListener;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("applicationListener/spring.xml");
		cap.start();
		cap.stop();
		cap.refresh();
		cap.close();
	}
}
