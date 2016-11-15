package warehouse.event;

public interface Tickable {
    
    /*
        initialEvents()
        @author: Kane Templeton
        use for adding initial events to the 
        event queue when object is created
    */
    public void initialEvents();
    
    /*
        addEvent(Event e)
        @author: Kane Templeton
        add a specified event to Master's event queue
    */
    public void addEvent(Event e); //add desired events as the simulation goes on
    
    /*
        tick()
        @author: Kane Templeton
        logic for every "tick" of the simulation's master clock
    */
    public void tick();

}
