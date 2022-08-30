package com.controladorERP.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controladorERP.entities.Item;
import com.controladorERP.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository repo;
	
	public List<Item> findAll(){
		return repo.findAll();
	}
}
