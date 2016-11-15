package production;

import java.util.ArrayList;
import java.util.PriorityQueue;
/*
    Master
    @author: Kane Templeton
    main class, runs the simulation
*/

public class Master {
	
	private boolean running;
        private int clockTime;
        
	
	protected PriorityQueue<Event> eventQueue;
        protected ArrayList<Tickable> activeEntities;
        
        public Master() {
            eventQueue = new PriorityQueue<>();
            clockTime=0;
        }
        
        
	/*
            start()
            @author: Kane Templeton
            start the simulation
        */
	public void start() {
            output("Starting simulation...");
            running=true;
            run();
	}
	
        /*
            stop()
            @author: Kane Templeton
            end the simulation
        */
	public void stop() {
            output("END SIMULATION.");
            running=false;
	}
	
        /*
            run()
            @author: Kane Templeton
            contains the running loop for the simulation
        */
	private void run() {
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
            initializeEvents()
            @author: Kane Templeton
            add events to the event queue before the simulation begins
        */
        public void initializeEvents() {
            // initialize events here

        }
        
        /*
            addEvent(Event e)
            @author: Kane Templeton
            add an event to the event queue
        */
        public void addEvent(Event e) {
            eventQueue.add(e);
        }
        
        /*
            getEventQueue()
            @author: Kane Templeton
            return the Master event queue
        */
        public PriorityQueue getEventQueue() {
            return eventQueue;
        }
        
        /*
            getMasterClockTime()
            @author: Kane Templeton
            return the current Master clock time
        */
        public int getMasterClockTime() {return clockTime;}
        
        /*
            output(String msg)
            @author: Kane Templeton
            output a message to the console 
            and include the current clock time
        */
        public void output(String msg) {
            System.out.println("[time="+getMasterClockTime()+"]"+msg);
        }
        
	
}