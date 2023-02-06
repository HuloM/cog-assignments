package com.example.crud_sqldb_demo.repository;

import com.example.crud_sqldb_demo.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
}
