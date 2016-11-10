package warehouse;

import java.util.ArrayList;

public class CustomerOrder extends Master implements Comparable<CustomerOrder> {
	ArrayList itemsInOrder = new ArrayList<Item>();
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
	
	public String statusUpdate() {
		return this.status;
	}
	
	public int compareTo(CustomerOrder other) {
		if (this.equals(other)) return 0;
		else return 1;
	}
}
