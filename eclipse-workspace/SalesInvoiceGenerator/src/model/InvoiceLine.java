package model;

import java.time.LocalDateTime;    

public class InvoiceLine {
	private String itemName;
	private int itemPrice;
	private int count;

	
	
	
	public void setItemName(String newItemName) {
		itemName = newItemName;
	}
	

	public void setCount (int newCount) {
		count= newCount;
}
	

	public void setItemPrice(int newPrice) {
		
		itemPrice = newPrice;
	}
	
}
