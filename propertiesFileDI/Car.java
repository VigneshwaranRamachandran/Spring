package propertiesFileDI;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class Car {

public String name;
public String age;
public void setName(String name) {
	this.name = name;
}
public void setAge(String age) {
	this.age = age;
}
public void display(){
	System.out.println(name+""+age);
}
}
