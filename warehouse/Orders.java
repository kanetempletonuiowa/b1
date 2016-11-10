package warehouse;

import java.util.ArrayList;
import java.util.Random;
/**
 * 
 * @author Scott Hoefer
 *
 */
public class Orders extends Master {
	ArrayList<CustomerOrder> currentOrders;
	Random rand = new Random();
	
	/**
	 * @author Scott HOefer
	 */
	Orders() {
		this.currentOrders = new ArrayList<CustomerOrder>();
	}
	/**
	 * @author Scott Hoefer
	 */
	public void generateOrder(int num, int q, String addy) {
		enqueueOrder(new CustomerOrder(new Item(num, q), addy));
	}
	/**
	 * @author scott Hoefer
	 */
	public void enqueueOrder(CustomerOrder order) {
		currentOrders.add(order);
		super.eventQueue.add(order);
	}
	/**
	 * @author scott hoefer
	 * @param and int x, which is the number of initial orders to add to the sim
	 */
	public void initialOrders(int x) {
		for (int i=0; i<x; i++) {
			generateOrder(rand.nextInt(6), rand.nextInt(4), "address");
		}
	}
}
