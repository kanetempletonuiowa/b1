package warehouse.mock;

import warehouse.Master;
import warehouse.event.Task;

//task that stops the simulation

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
