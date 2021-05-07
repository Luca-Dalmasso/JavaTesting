package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import backend.Inventory;
import backend.Item;
import exceptions.ItemAlreadyExists;
import exceptions.ItemNotExists;

public class testSearchItem {

	@Test
	public void testValidSearch() throws ItemAlreadyExists, ItemNotExists {
		Item i1 = new Item ("item1", "...", "...");
		Item i2 = new Item ("item2", "...", "...");
		Item i3 = new Item ("item3", "...", "...");
		Inventory inv = new Inventory ();
		inv.addItem(i1);
		inv.addItem(i2);
		inv.addItem(i3);
		assertEquals(i2,inv.searchItem(i2.getItemCode()));
	}
	
	@Test
	public void testNotExistsSearch() throws ItemAlreadyExists, ItemNotExists {
		Item i1 = new Item ("item1", "...", "...");
		Inventory inv = new Inventory ();
		inv.addItem(i1);
		assertThrows(ItemNotExists.class, () -> { inv.searchItem("item34"); } );
	}
	
	@Test
	public void testInvalidCodeSearch() throws ItemAlreadyExists, ItemNotExists {
		Inventory inv = new Inventory ();
		assertThrows(ItemNotExists.class, () -> { inv.searchItem(""); } );
	}
	
	
	@Test
	public void testNullSearch() throws ItemAlreadyExists, ItemNotExists {
		Inventory inv = new Inventory ();
		assertThrows(ItemNotExists.class, () -> { inv.searchItem(null); } );
	}
	
}
