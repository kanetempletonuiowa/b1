package warehouse.mock.inform;

import warehouse.Master;
import warehouse.event.Event;
import warehouse.event.Tickable;

//reports the current queued events to the console

public class Informer implements Tickable {
    
    public Informer() {
        initialEvents();
    }
    
    public void initialEvents() {
        Event e = new InformEvent(5,new InformTask());
        Master.addEvent(e);
    }
    
    public void addEvent(Event e) {
        Master.addEvent(e);
    }

}
