package EventListeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public abstract class CStopEventHandler implements ApplicationListener<ContextStoppedEvent>
{
public void  onApplicationEvent(ContextStoppedEvent event)
{
System.out.println("context stoped evnt received");
}

}