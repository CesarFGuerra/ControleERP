package com.controladorERP.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controladorERP.services.ItemService;

@RestController
@RequestMapping(value = "/itens")
public class ItemResources {
	
	@Autowired
	private ItemService service;

}
