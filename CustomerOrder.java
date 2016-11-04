package warehouse;

import java.util.ArrayList;

public class CustomerOrder extends Master {
	ArrayList itemsInOrder;
	String address;
	String status;
	
	CustomerOrder(Item i, String address) {
		this.address = address;
		this.status = "pending";
		itemsInOrder.add(i);
	}
	
	public void addItemsToOrder(Item i) {
		itemsInOrder.add(i);
	}
}
