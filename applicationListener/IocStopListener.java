package applicationListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class IocStopListener implements ApplicationListener<ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		System.out.println("stoped event listerner");
		
	}

}
