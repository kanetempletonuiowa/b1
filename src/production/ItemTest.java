package production;

//import static org.junit.Assert.*;

import production.Item;


//import org.junit.Test;

public class ItemTest {

	public void testItemVariables() {
		Item i = new Item(0, 1);
		
		//assertEquals(0, i.itemNum);
		//assertEquals(1, i.quantity);
	}
	
	public void testItemDescription() {
		Item i = new Item(5, 1);
		
		//assertEquals("item5", i.description);
	}
}
