package warehouse;

import java.util.PriorityQueue;


public class Master {
	
	private static int ticks;
	private static boolean running;
	
	protected static PriorityQueue<Object> eventQueue;
	protected static MockInventory inventoryMock = new MockInventory();
	protected static Orders masterOrders = new Orders();
	
	public static void start() {
		running=true;
		run();
	}
	
	public static void stop() {
		running=false;
	}
	
	private static void run() {
		while (running) {
			if (eventQueue.isEmpty()) stop();
			else {
				// handle events
			}
		}
	}
	
	public static void main(String[] args) {
		eventQueue = new PriorityQueue<>();
		ticks=0;
		masterOrders.initialOrders(10);
		start();
	}
	
}
