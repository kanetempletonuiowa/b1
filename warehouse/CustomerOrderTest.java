package warehouse;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerOrderTest {

	@Test
	public void testAddItemsToOrder() {
		Item i = new Item(0, 1);
		CustomerOrder o = new CustomerOrder(i, "Street Address");
		
		assertEquals(1, o.itemsInOrder.size());
		o.addItemsToOrder(new Item(1, 2));
		o.addItemsToOrder(new Item(5, 5));
		assertEquals(3, o.itemsInOrder.size());
	}

	@Test
	public void testStatusUpdate() {
		Item i = new Item(3, 1);
		CustomerOrder o = new CustomerOrder(i, "Street Address");
		
		assertEquals("pending", o.statusUpdate());
	}
	
	@Test
	public void testAddress() {
		CustomerOrder o = new CustomerOrder(new Item(1,1), "1234 Test St.");
		
		assertEquals("1234 Test St.", o.address);
	}

}
