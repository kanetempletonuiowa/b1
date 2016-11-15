package warehouse;

import java.util.ArrayList;
import java.util.PriorityQueue;
import warehouse.event.Event;
import warehouse.event.Tickable;
import warehouse.mock.inform.InformEvent;
import warehouse.mock.inform.InformTask;
import warehouse.mock.inform.Informer;
import warehouse.mock.Kill;
import warehouse.mock.MockEvent;
import warehouse.mock.robot.BuildRobot;
import warehouse.mock.robot.MockRobot;

/*
    Master
    @author: Kane Templeton
    main class, runs the simulation
*/

public class Master {
	
	private static boolean running;
        private static int clockTime;
        
        //mock objects
        private static Informer masterInformer;
        private static MockRobot testBot;
	
	protected static PriorityQueue<Event> eventQueue;
        protected static ArrayList<Tickable> activeEntities;
        
        
	/*
            start()
            @author: Kane Templeton
            start the simulation
        */
	public static void start() {
            output("Starting simulation...");
            running=true;
            run();
	}
	
        /*
            stop()
            @author: Kane Templeton
            end the simulation
        */
	public static void stop() {
            output("END SIMULATION.");
            running=false;
	}
	
        /*
            run()
            @author: Kane Templeton
            contains the running loop for the simulation
        */
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
        
	
        /*
            main(String[] args)
            @author: Kane Templeton
            main method. initializes event queue
            and starts simulation
        */
	public static void main(String[] args) {
		eventQueue = new PriorityQueue<>();
                clockTime=0;
                initializeEvents();
		start();
	}
        
        /*
            initializeEvents()
            @author: Kane Templeton
            add events to the event queue before the simulation begins
        */
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
        
        /*
            addEvent(Event e)
            @author: Kane Templeton
            add an event to the event queue
        */
        public static void addEvent(Event e) {
            eventQueue.add(e);
        }
        
        /*
            getEventQueue()
            @author: Kane Templeton
            return the Master event queue
        */
        public static PriorityQueue getEventQueue() {
            return eventQueue;
        }
        
        /*
            getMasterClockTime()
            @author: Kane Templeton
            return the current Master clock time
        */
        public static int getMasterClockTime() {return clockTime;}
        
        /*
            output(String msg)
            @author: Kane Templeton
            output a message to the console 
            and include the current clock time
        */
        public static void output(String msg) {
            System.out.println("[time="+getMasterClockTime()+"]"+msg);
        }
        
        /*
            setRobot(MockRobot r)
            @author: Kane Templeton
            set the test robot
        */
        public static void setRobot(MockRobot r) {testBot=r;}
        
        /* 
            getRobot()
            @author: Kane Templeton
            return the test robot
        */
        public static MockRobot getRobot() {return testBot;}
	
}