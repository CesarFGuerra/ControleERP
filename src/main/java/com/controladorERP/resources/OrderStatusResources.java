package com.controladorERP.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controladorERP.services.OrderStatusService;

@RestController
@RequestMapping(value = "/OrderStatus")
public class OrderStatusResources {
	
	@Autowired
	private OrderStatusService service;

}
