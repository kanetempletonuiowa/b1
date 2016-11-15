package warehouse.mock.inform;

import java.util.PriorityQueue;
import warehouse.Master;
import warehouse.event.Event;
import warehouse.event.Task;

/*
    InformTask
    @author: Kane Templeton
    task for InformEvent
*/

public class InformTask implements Task {
    
    public InformTask() {
        
    }
    
    /*
        fire()
        @author: Kane Templeton
        lists all events currently in the Master event queue
    */
    public void fire() {
        PriorityQueue<Event> q = Master.getEventQueue();
        PriorityQueue<Event> q2 = new PriorityQueue<>(q);
        Master.output("Current Queued Events:");
        while (q2.size()>0) {
            Event e = q2.poll();
            System.out.println("\t"+e.getName()+": will fire at time "+e.getFireTime());
        }
    }

}
