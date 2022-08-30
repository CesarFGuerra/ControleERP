package com.controladorERP.entities;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String number;
	
	@DBRef(lazy = true)
	private List<OrderStatus> orderItems;
	
	public Order() {
	}

	public Order(String number) {
		super();
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public List<OrderStatus> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderStatus> orderItems) {
		this.orderItems = orderItems;
	}
	
	
	
}
