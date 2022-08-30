package com.controladorERP.DTO;

import com.controladorERP.entities.Item;
import com.controladorERP.entities.Order;

public class ItemDTO {
	
	private String itemName;
	private Order itemOrder;
	
	public ItemDTO() {	
	}
	
	public ItemDTO(Item obj) {
		itemName = obj.getItemName();
		itemOrder = obj.getItemOrder();
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Order getItemOrder() {
		return itemOrder;
	}

	public void setItemOrder(Order itemOrder) {
		this.itemOrder = itemOrder;
	}
	
	

}
