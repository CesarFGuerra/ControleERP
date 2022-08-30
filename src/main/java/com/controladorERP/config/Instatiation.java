package com.controladorERP.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.controladorERP.entities.Family;
import com.controladorERP.entities.Item;
import com.controladorERP.entities.Order;
import com.controladorERP.entities.OrderStatus;
import com.controladorERP.entities.Production;
import com.controladorERP.repository.ItemRepository;
import com.controladorERP.repository.OrderStatusRepository;

@Configuration
public class Instatiation implements CommandLineRunner{
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private OrderStatusRepository orderStatusRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
			Item i1 = new Item("AJXZ09R323SA32S", new Family("Fresa Topo", new Production ("Teste")));
			
			itemRepository.saveAll(Arrays.asList(i1));
			
			OrderStatus os1 = new OrderStatus(new Order("01.220521C"), i1, 10, 350.00);
			
			orderStatusRepository.saveAll(Arrays.asList(os1));
			
			
		
	}

}
