package com.controladorERP.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class OrderStatus implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Order itemOrder;
	private Item item;
	private Integer quantity;
	private Double price;
	
	public OrderStatus() {
	}

	public OrderStatus(Order itemOrder, Item item, Integer quantity, Double price) {
		super();
		this.itemOrder = itemOrder;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Item getItems() {
		return item;
	}
	public void setListItems(Item item) {
		this.item = item;
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

	public Order getItemOrder() {
		return itemOrder;
	}

	public void setItemOrder(Order itemOrder) {
		this.itemOrder = itemOrder;
	}
	
	
	
	
}
