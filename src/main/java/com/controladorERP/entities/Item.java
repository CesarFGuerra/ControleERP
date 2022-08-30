package com.controladorERP.entities;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String itemName;
	private Family itemFamily;
	
	public Item() {
	}

	public Item(String itemName, Family itemFamily) {
		super();
		this.itemName = itemName;
		this.itemFamily = itemFamily;
		
	}

	public String getItemName() {
		return itemName;
	}

	public Family getItemFamily() {
		return itemFamily;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(itemName, other.itemName);
	}
	
	

}
