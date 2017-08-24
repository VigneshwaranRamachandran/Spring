package defaultCollectionDatatype;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	private List<?> fruits;
	private Set<?> cricketers;
	private Map<?, ?> countryC;
	public void setFruits(List<?> fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(Set<?> cricketers) {
		this.cricketers = cricketers;
	}
	public void setCountryC(Map<?, ?> countryC) {
		this.countryC = countryC;
	}
	public void display(){
		for(Object f:fruits){
			System.out.println("fruit:"+f);
		}
		for(Object c:cricketers){
			System.out.println("cricketers "+c);
		}
		Set<?> keys=countryC.keySet();
		for(Object key:keys){
			System.out.println("country:"+key+"capital:"+countryC.get(key));
		}
	}
}
