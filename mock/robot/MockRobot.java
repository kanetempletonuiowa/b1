package production.mock.robot;

import production.Master;
import production.Production;
import production.Event;
import production.Tickable;

/*
    MockRobot
    @author: Kane Templeton
    fake robot that can update coordinates
*/
public class MockRobot implements Tickable {
    
    private int xCoordinate,yCoordinate;
    
    public MockRobot(int x, int y) {
        xCoordinate=x;
        yCoordinate=y;
        initialEvents();
    }
    public void move(int x, int y) {
        xCoordinate=x;
        yCoordinate=y;
    }
    public void printCoordiantes() {
        Production.output("Robot has coordinates ("+xCoordinate+","+yCoordinate+")");
    }

    @Override
    public void initialEvents() {
        //initialize an event for the robot to move eventually
        Production.addEvent(new MoveEvent(this,40,30,50));
        
    }
    public void addEvent(Event e) {
        Production.addEvent(e);
    }
    
    /*
        tick()
        @author: Kane Templeton
        mock ticking; increment coordinates by 1
    */
    public void tick() {
        move(xCoordinate+1,yCoordinate+1);
    }

}
