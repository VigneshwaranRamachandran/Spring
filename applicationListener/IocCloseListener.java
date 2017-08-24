package applicationListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class IocCloseListener implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent arg0) {
		System.out.println("closed event");
		
	}

}
