package test;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

import backend.Inventory;
import backend.Item;
import exceptions.ItemAlreadyExists;
import exceptions.ItemNotExists;

public class testAddItem {

	@Test
	public void testItemAlreadyExists() throws ItemAlreadyExists {
		Item i = new Item ("item1", "...", "...");
		Inventory inv = new Inventory ();
		inv.addItem(i);
		assertThrows(ItemAlreadyExists.class, () -> { inv.addItem(i); } );
	}
	
	@Test
	public void testItemAdded() throws ItemAlreadyExists, ItemNotExists {
		Item i = new Item ("item1", "...", "...");
		Inventory inv = new Inventory ();
		inv.addItem(i);
	}
	
	@Test
	public void testNullItem() throws ItemAlreadyExists {
		Inventory inv = new Inventory ();
		/* NullPointerException expected! */
		assertThrows(NullPointerException.class, () -> { inv.addItem(null);} );
	}
	
}
