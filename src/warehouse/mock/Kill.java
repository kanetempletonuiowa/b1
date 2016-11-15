package warehouse.mock;

import warehouse.Master;
import warehouse.event.Task;

/*
    Kill
    @author: Kane Templeton
    Task to stop the simulation
*/

public class Kill implements Task {

    /*
        fire()
        @author: Kane Templeton
        tells Master to stop the simulation
    */
    @Override
    public void fire() {
        Master.stop();
    }
    

}
