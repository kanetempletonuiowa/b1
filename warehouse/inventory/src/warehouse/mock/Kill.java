package warehouse.mock;

import warehouse.Master;
import warehouse.event.Task;

//task that stops the simulation

public class Kill implements Task {

    @Override
    public void fire() {
        Master.stop();
    }
    

}
