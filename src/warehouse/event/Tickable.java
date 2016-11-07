package warehouse.event;

//not sure that "tickable" is the right name for this,
//but this should represent anything that can have events (ex: robots, floor, orders, etc.)

public interface Tickable {
    
    public void initialEvents(); //queue initial events
    public void addEvent(Event e); //add desired events as the simulation goes on

}
