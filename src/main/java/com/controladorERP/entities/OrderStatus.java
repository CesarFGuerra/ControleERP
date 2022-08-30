package com.controladorERP.entities;

import java.io.Serializable;

public class OrderStatus implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Item listItems;
	private Integer quantity;
	private Double price;
	
	public OrderStatus() {
	}

	public OrderStatus(Order order, Item listItems, Integer quantity, Double price) {
		super();
		this.listItems = listItems;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Item getListItems() {
		return listItems;
	}
	public void setListItems(Item listItems) {
		this.listItems = listItems;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
