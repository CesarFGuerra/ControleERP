package com.controladorERP.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.controladorERP.entities.Item;
import com.controladorERP.entities.Order;
import com.controladorERP.repository.ItemRepository;

@Configuration
public class Instatiation implements CommandLineRunner{
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
			Item i1 = new Item("AJXZ09R323SA32S", new Order("01.220521C/01"));
			
			itemRepository.saveAll(Arrays.asList(i1));
			
		
	}

}
