package production;

import production.Master;

public class Item extends Master {
	protected int itemNum;
	protected int quantity;
	protected String description;
	
	
	public Item (int n, int q) {
		this.itemNum = n;
		this.quantity = q;
		this.description = (String) MockInventory.inventory.get(n);
	}
}
