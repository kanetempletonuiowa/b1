package production.mock.inform;

import production.Event;
import production.Task;

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
