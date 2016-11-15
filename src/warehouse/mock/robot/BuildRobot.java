// Kane Templeton
package warehouse.mock.robot;

import warehouse.Master;
import warehouse.event.Event;
import warehouse.event.Task;

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
        Master.output("Building mock robot...");
        MockRobot r = new MockRobot(x,y);
        Master.setRobot(r);
        Master.getRobot().printCoordiantes();
    }
    
}

public class BuildRobot extends Event {

    public BuildRobot(int t, int x, int y) {
        super("Build New Robot", t, new Construct(x,y));
    }

}
