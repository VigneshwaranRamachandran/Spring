package applicationListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class IocStartListener implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
	System.out.println("started event");
	}

}
