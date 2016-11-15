package warehouse.event;

/*
    Task
    @author: Kane Templeton
    task to be fired when an event is called
*/

public interface Task {
	
    /*
        fire()
        @author: Kane Templeton
        fill with logic for when task is fired from an event
    */
    public void fire();
    
}