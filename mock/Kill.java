package production.mock;

import production.Master;
import production.Production;
import production.Task;

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
        Production.getMaster().stop();
    }
    

}
