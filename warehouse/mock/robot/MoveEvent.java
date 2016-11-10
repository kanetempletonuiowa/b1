// Kane Templeton
// MoveEvent.java
package warehouse.mock.robot;

import warehouse.Master;
import warehouse.event.Event;
import warehouse.event.Task;

//event to move a robot

//task for the event
class MoveRobot implements Task {
    
    private MockRobot robot;
    private int toX,toY;
    
    public MoveRobot(MockRobot r, int x, int y) {
        robot=r;
        toX=x;
        toY=y;
    }

    @Override
    public void fire() {
       robot.move(toX, toY);
       Master.output("Robot being moved. New Coordinates:");
       robot.printCoordiantes();
    }
    
}

public class MoveEvent extends Event {

    public MoveEvent(MockRobot r, int t, int toX, int toY) {
        super("Move Robot to ("+toX+","+toY+")", t, new MoveRobot(r,toX,toY));
    }
    
    

}
