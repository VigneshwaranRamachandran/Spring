package autowireDI;

public class Bus {
	private Engine engine;

	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}


//	public Bus(Engine engine) {
//		super();
//		this.engine = engine;
//	}


	public void display(){
		System.out.println(engine.getModelYear());
	}

}
