package warehouse;

public class Item extends Master {
	protected static int itemNum;
	protected static int quantity;
	protected static String description;
	
	
	Item (int n, int q) {
		this.itemNum = n;
		this.quantity = q;
		this.description = (String) inventoryMock.inventory.get(n);
	}
}
