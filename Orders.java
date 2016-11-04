package warehouse;

import java.util.ArrayList;
import java.util.Random;

public class Orders extends Master {
	ArrayList<CustomerOrder> currentOrders;
	Random rand = new Random();
	
	// constructor just initiates the currentOrders ArrayList
	Orders() {
		this.currentOrders = new ArrayList<CustomerOrder>();
	}
	
	public void generateOrder(int num, int q, String addy) {
		enqueueOrder(new CustomerOrder(new Item(rand.nextInt(6), rand.nextInt(4)), addy));
	}
	
	public void enqueueOrder(CustomerOrder order) {
		currentOrders.add(order);
		eventQueue.add(order);
	}
	
	public String statusUpdate(CustomerOrder o) {
		return o.status;
	}
	
	public void initialOrders(int x) {
		for (int i=0; i<=x; i++) {
			generateOrder(rand.nextInt(6), rand.nextInt(4), "address");
		}
	}
}
