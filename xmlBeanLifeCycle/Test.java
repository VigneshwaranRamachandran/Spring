package xmlBeanLifeCycle;


public class Test  {
	private String  username, pwd;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void myInit() throws Exception {
		System.out.println(username+""+pwd);
		System.out.println("connection open");
	}

	public void myDestroy() throws Exception {

		System.out.println("close");
	}

	public void save(int id, String name) throws Exception {
		
		System.out.println("insert sucessfully"+id+":"+name);
	}

}
