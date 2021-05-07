package test;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

import backend.Inventory;
import backend.Item;
import exceptions.ItemAlreadyExists;
import exceptions.ItemNotAvailable;
import exceptions.ItemNotExists;

public class testSubtractQuantity {
	
	@Test
	public void testNegativeQuantityToSubtract() throws ItemNotExists, ItemNotAvailable, ItemAlreadyExists  {
		Item item1 = new Item("i1","red hammer", "tecknet");
		Inventory inventory = new Inventory();
		inventory.addItem(item1);
		inventory.subtractQtyToItem("i1", -6);
	}
	
	@Test
	public void testSubtractTooMuch() throws ItemNotExists, ItemNotAvailable, ItemAlreadyExists  {
		Item item1 = new Item("i1","red hammer", "tecknet");
		Inventory inventory = new Inventory();
		inventory.addItem(item1);
		assertThrows(ItemNotAvailable.class, () -> { inventory.subtractQtyToItem("i1", 10); });
		
	}

}
