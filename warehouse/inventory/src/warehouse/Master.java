package warehouse;

import java.util.PriorityQueue;
import warehouse.event.Event;
import warehouse.mock.inform.InformEvent;
import warehouse.mock.inform.InformTask;
import warehouse.mock.inform.Informer;
import warehouse.mock.Kill;
import warehouse.mock.MockEvent;
import warehouse.mock.robot.BuildRobot;
import warehouse.mock.robot.MockRobot;


public class Master {
	
	private static boolean running;
        private static int clockTime;
        
        //mock objects
        private static Informer masterInformer;
        private static MockRobot testBot;
	
	protected static PriorityQueue<Event> eventQueue;
	
	public static void start() {
            output("Starting simulation...");
            running=true;
            run();
	}
	
	public static void stop() {
            output("END SIMULATION.");
            running=false;
	}
	
	private static void run() {
            double clock=System.currentTimeMillis();
            while (running) {
                //create a reasonable time structure, time incrememts approx. every second
                if (System.currentTimeMillis()-clock >= 1000) {
                    clockTime++;
                    clock=System.currentTimeMillis();
                }
                //check if it is time to fire the next event
                if (!eventQueue.isEmpty())
                    if (eventQueue.peek().getFireTime()<=clockTime) 
                        eventQueue.poll().getTask().fire();
                
            }
	}
        
	
	public static void main(String[] args) {
		eventQueue = new PriorityQueue<>();
                clockTime=0;
                initializeEvents();
		start();
	}
        
        private static void initializeEvents() {
            // initialize events here
            masterInformer = new Informer();
            addEvent(new BuildRobot(25,100,100));
            addEvent(new MockEvent(20,"test 2"));
            addEvent(new MockEvent(10,"test 1"));
            addEvent(new Event("End Simulation",60,new Kill()));
            masterInformer.addEvent(new InformEvent(30,new InformTask()));
            masterInformer.addEvent(new InformEvent(50,new InformTask()));
        }
        
        public static void addEvent(Event e) {
            eventQueue.add(e);
        }
        
        public static PriorityQueue getEventQueue() {
            return eventQueue;
        }
        
        public static int getMasterClockTime() {return clockTime;}
        
        //print a message to the console and include the current clock time
        public static void output(String msg) {
            System.out.println("[time="+getMasterClockTime()+"]"+msg);
        }
        
        public static void setRobot(MockRobot r) {testBot=r;}
        public static MockRobot getRobot() {return testBot;}
	
}