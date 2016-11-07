package warehouse;

import java.util.HashMap;

public class MockInventory {
	protected HashMap inventory = new HashMap<Integer, String>();
	
	MockInventory() {
		inventory.put(0, "item0");
		inventory.put(1, "item1");
		inventory.put(2, "item2");
		inventory.put(3, "item3");
		inventory.put(4, "item4");
		inventory.put(5, "item5");
	}
}
