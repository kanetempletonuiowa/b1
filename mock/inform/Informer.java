package production.mock.inform;

import production.Master;
import production.Production;
import production.Event;
import production.Tickable;


/*
    Informer
    @author: Kane Templeton
    tickable object that informs users of current simulation info
*/

public class Informer implements Tickable {
    
    public Informer() {
        initialEvents();
    }
    
    /*
        initialEvents()
        @author: Kane Templeton
        adds an event to list current queued events at time 5
    */
    public void initialEvents() {
        Production.getMaster().addEvent(new InformEvent(5, new InformTask()));
    }
    
    /*
        addEvent(Event e)
        @author: Kane Templeton
        adds an event to Master event queue
        probably unnecessary since you can just call Master.addEvent(e)...
        TODO: probably remove this method from tickable interface
    */
    public void addEvent(Event e) {
        Production.getMaster().addEvent(e);
    }
    
    /*
        tick()
        @author: Kane Templeton
        tick logic, which in this case is to do nothing
    */
    public void tick(){}

}
