package warehouse;

import java.util.PriorityQueue;


public class Master {
	
	//private static int ticks;
	//private static boolean running;
	
	public static PriorityQueue eventQueue = new PriorityQueue();
	protected static MockInventory inventoryMock = new MockInventory();
	protected static Orders masterOrders = new Orders();
	/*
	public static void start() {
		running=true;
		run();
	}
	
	public static void stop() {
		running=false;
	}
	*/
	private static void run() {
		while (!eventQueue.isEmpty()) {
			// handle simulation
		}
	}
	
	
	public static void main(String[] args) {
		Master M = new Master();
		M.masterOrders.initialOrders(10);
		
		System.out.println(M.masterOrders.currentOrders.size());
		System.out.println(M.eventQueue.size());
	}
	
}
