package warehouse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void testItemVariables() {
		Item i = new Item(0, 1);
		
		assertEquals(0, i.itemNum);
		assertEquals(1, i.quantity);
	}
	
	@Test
	public void testItemDescription() {
		Item i = new Item(5, 1);
		
		assertEquals("item5", i.description);
	}
}
