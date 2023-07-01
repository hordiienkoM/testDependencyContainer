import customEventBus.Event;
import customEventBus.PostProcessComponentEvent;
import customEventBus.Subscriber;

public class PostProcessSubscriber implements Subscriber{
    @Override
    public void handleEvent(Event event) {
        if (event instanceof PostProcessComponentEvent) {
            PostProcessComponentEvent postProcessEvent = (PostProcessComponentEvent) event;
            System.out.println("Post-processing component: " + postProcessEvent.getComponentClass());
        }
    }
}
