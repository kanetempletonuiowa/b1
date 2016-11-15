// Kane Templeton
package production.mock.robot;

import production.Master;
import production.Production;
import production.Event;
import production.Task;

//event to create a mock robot

//task class for the event
class Construct implements Task {
    
    private int x,y;
    
    public Construct(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public void fire() {
        Production.output("Building mock robot...");
        MockRobot r = new MockRobot(x,y);
        Production.getMaster().setRobot(r);
        Production.getMaster().getRobot().printCoordiantes();
    }
    
}

public class BuildRobot extends Event {

    public BuildRobot(int t, int x, int y) {
        super("Build New Robot", t, new Construct(x,y));
    }

}
