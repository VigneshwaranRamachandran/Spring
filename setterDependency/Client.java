package setterDependency;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("setterDependency/spring.xml");
	Test t=(Test)ac.getBean("t");
	t.hello("vignesh");

	}

}
