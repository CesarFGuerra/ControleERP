package com.controladorERP.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.controladorERP.entities.Item;


@Repository
public interface ItemRepository extends MongoRepository<Item, String> {

}
