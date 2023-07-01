import customEventBus.Event;
import customEventBus.PreProcessComponentEvent;
import customEventBus.Subscriber;

public class PreProcessSubscriber implements Subscriber {
    @Override
    public void handleEvent(Event event) {
        if (event instanceof PreProcessComponentEvent) {
            PreProcessComponentEvent preProcessEvent = (PreProcessComponentEvent) event;
            System.out.println("Pre-processing component: " + preProcessEvent.getComponentClass());
        }
    }
}
