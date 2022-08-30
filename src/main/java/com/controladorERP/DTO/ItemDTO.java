package com.controladorERP.DTO;

import com.controladorERP.entities.Family;
import com.controladorERP.entities.Item;
import com.controladorERP.entities.Order;

public class ItemDTO {
	
	private String itemName;
	private Family itemFamily;
	
	public ItemDTO() {	
	}
	
	public ItemDTO(Item obj) {
		itemName = obj.getItemName();
		itemFamily = obj.getItemFamily();
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Family getItemFamily() {
		return itemFamily;
	}

	public void setItemOrder(Family itemFamily) {
		this.itemFamily = itemFamily;
	}
	
	

}
