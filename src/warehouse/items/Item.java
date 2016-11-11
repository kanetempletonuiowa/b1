package warehouse.items;

import warehouse.Master;

public class Item extends Master {
	protected static int itemNum;
	protected static int quantity;
	protected static String description;
	
	
	public Item (int n, int q) {
		this.itemNum = n;
		this.quantity = q;
		this.description = (String) MockInventory.inventory.get(n);
	}
}
