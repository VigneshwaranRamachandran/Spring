package programaticBeanLifeCycle2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean {
	private String  username, pwd;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println(username+""+pwd);
		System.out.println("connection open");
	}

	public void destroy() throws Exception {

		System.out.println("close");
	}

	public void save(int id, String name) throws Exception {
		
		System.out.println("insert sucessfully"+id+":"+name);
	}

}
