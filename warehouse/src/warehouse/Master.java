package warehouse;

import java.util.PriorityQueue;
import warehouse.event.Event;

public class Master {
	
	private static int ticks;
	private static boolean running;
	
	private static PriorityQueue<Event> eventQueue;
	
	
	
	
	public static void main(String[] args) {
		eventQueue = new PriorityQueue<>();
		ticks=0;
		start();
	}
	
	public static void start() {
		running=true;
		run();
	}
	
	public static void stop() {
		running=false;
	}
	
	private static void run() {
		while (running) {

		}
	}
	
	public static void addEvent(Event e) {
	}
}
