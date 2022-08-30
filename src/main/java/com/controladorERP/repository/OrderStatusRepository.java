package com.controladorERP.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.controladorERP.entities.Item;
import com.controladorERP.entities.OrderStatus;


@Repository
public interface OrderStatusRepository extends MongoRepository<OrderStatus, String> {

}
