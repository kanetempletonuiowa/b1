package warehouse.mock.robot;

import warehouse.Master;
import warehouse.event.Event;
import warehouse.event.Tickable;

//fake robot that can update its coordinates


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
        Master.output("Robot has coordinates ("+xCoordinate+","+yCoordinate+")");
    }

    @Override
    public void initialEvents() {
        //initialize an event for the robot to move eventually
        Master.addEvent(new MoveEvent(this,40,30,50));
        
    }
    public void addEvent(Event e) {
        Master.addEvent(e);
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
