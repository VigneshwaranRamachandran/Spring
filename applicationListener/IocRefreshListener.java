package applicationListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class IocRefreshListener implements ApplicationListener<ContextRefreshedEvent> {

	

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
	System.out.println("refreshed event");
		
	}

}
