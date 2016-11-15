package warehouse.mock.inform;

import warehouse.event.Event;
import warehouse.event.Task;

//event class to be called by informer. probably didn't need this as a separate class

/*
    InformEvent
    @author: Kane Templeton
    Event to print simulation information
*/

public class InformEvent extends Event {

    public InformEvent(int t, Task task) {
        super("Print Information",t, task);
    }
    

}
