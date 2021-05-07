package backend;

public class Item {
	
	private String itemCode;
	private String itemDescription;
	private String itemName;
	
	public Item (String code, String description, String name) {
		itemCode = code;
		itemDescription = description;
		itemName = name;
	}

	public String getItemCode() {
		return itemCode;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public String getItemName() {
		return itemName;
	}
	
}
