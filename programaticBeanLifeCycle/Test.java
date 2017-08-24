package programaticBeanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean {
	private String driver, url, username, pwd;
	private Connection con;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void afterPropertiesSet() throws Exception {
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, pwd);
		System.out.println("connection open");
	}

	public void destroy() throws Exception {
		con.close();
		System.out.println("close");
	}

	public void save(int id, String name) throws Exception {
		PreparedStatement p = con.prepareStatement("insert into vicky values(?,?)");
		p.setInt(1, id);
		p.setString(2, name);
		p.executeUpdate();
		System.out.println("insert sucessfully");
	}

}
