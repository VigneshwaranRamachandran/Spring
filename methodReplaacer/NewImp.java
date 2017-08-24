
package methodReplaacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;


public class NewImp implements MethodReplacer {

	
	@Override
	public Object reimplement(Object o, Method m, Object[] para) throws Throwable {
		System.out.println("new implementations");
		return o;
	}

}
