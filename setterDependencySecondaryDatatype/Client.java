package setterDependencySecondaryDatatype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	//ApplicationContext ac=new ClassPathXmlApplicationContext("setterDependencySecondaryDatatype/spring.xml");
		String files[]=new String[]{"setterDependencySecondaryDatatype/car.xml","setterDependencySecondaryDatatype/engine.xml"};
		ApplicationContext ac=new ClassPathXmlApplicationContext(files);
		Car t=(Car)ac.getBean("t");
	t.display();

	}

}
