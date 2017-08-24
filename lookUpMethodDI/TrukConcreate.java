package lookUpMethodDI;

public class TrukConcreate {
public EngineDependency myTrukEngine(){
	EngineDependency e=new EngineDependency();
	e.setName("dopakur engine");
	return e;
}
}
