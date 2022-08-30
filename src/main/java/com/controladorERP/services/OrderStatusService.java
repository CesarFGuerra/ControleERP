package com.controladorERP.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controladorERP.entities.OrderStatus;
import com.controladorERP.repository.OrderStatusRepository;

@Service
public class OrderStatusService {
	
	@Autowired
	private OrderStatusRepository repo;
	
	public List<OrderStatus> findAll(){
		return repo.findAll();
	}
}
