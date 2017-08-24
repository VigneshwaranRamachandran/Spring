package annoationBeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Test  {
	private String  username, pwd;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
@PostConstruct
	public void myInit() throws Exception {
		System.out.println(username+""+pwd);
		System.out.println("connection open");
	}
@PreDestroy
	public void myDestroy() throws Exception {

		System.out.println("close");
	}

	public void save(int id, String name) throws Exception {
		
		System.out.println("insert sucessfully"+id+":"+name);
	}

}
