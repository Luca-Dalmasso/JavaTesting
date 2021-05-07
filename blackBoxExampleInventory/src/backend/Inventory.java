package backend;

import java.util.HashMap;
import java.util.Map;

import exceptions.*;

public class Inventory {

	private Map<String,Item> catalogo = new HashMap<>();
	private Map<String,Integer> inventario = new HashMap<>();
	
	public void addItem(Item i) throws ItemAlreadyExists {
			if (catalogo.get(i.getItemCode()) != null) {
				throw new ItemAlreadyExists();
			}
			catalogo.put(i.getItemCode(), i);
			inventario.put(i.getItemCode(), 1);
	}
	
    public Item searchItem(String itemCode) throws ItemNotExists {
    	Item i = catalogo.get(itemCode);
    	if (i == null) {
    		throw new ItemNotExists();
    	}
    	return catalogo.get(itemCode);
    }
    
    public int availabilityItem(String itemCode) throws ItemNotExists {
    	Item i = searchItem(itemCode);
    	return inventario.get(i.getItemCode());
    }
    
    public void subtractItem(String itemCode) throws ItemNotExists, ItemNotAvailable{
    	Item i = searchItem(itemCode);
    	Integer qta = inventario.get(i.getItemCode());
    	if (qta==0) { throw new ItemNotAvailable(); }
    	else { inventario.put(i.getItemCode(), qta - 1 ); }
    }
    
    public void addQtyToItem(String itemCode, int qty_to_add) throws ItemNotExists{
    	Item i = searchItem(itemCode);
    	Integer qta = inventario.get(i.getItemCode());
    	inventario.put(i.getItemCode(), qta + 1 );
    }
    
    public void subtractQtyToItem (String itemCode, int qty_to_subtract) throws ItemNotExists, ItemNotAvailable{
    	Item i = searchItem(itemCode);
    	Integer qta = inventario.get(i.getItemCode());
    	if (qta - qty_to_subtract > 0) { inventario.put(i.getItemCode(), qta - qty_to_subtract ); }
    	else {throw new ItemNotAvailable();}
    }
    
}
