package warehouse;

import java.util.ArrayList;

public class CustomerOrder extends Event implements Comparable<CustomerOrder> {
	ArrayList itemsInOrder = new ArrayList<Item>();
	String address;
	String status;
	
	/**
	 * @author Scott Hoefer
	 */
	CustomerOrder(Item i, String address) {
		this.address = address;
		this.status = "pending";
		itemsInOrder.add(i);
	}
	/**
	 * @author Scott Hoefer
	 * @param An instance of the item class
	 */
	public void addItemsToOrder(Item i) {
		itemsInOrder.add(i);
	}
	/**
	 * @author Scott Hoefer
	 */
	public String statusUpdate() {
		return this.status;
	}
	/**
	 * @author Scott Hoefer
	 */
	public int compareTo(CustomerOrder other) {
		if (this.equals(other)) return 0;
		else return 1;
	}
}
