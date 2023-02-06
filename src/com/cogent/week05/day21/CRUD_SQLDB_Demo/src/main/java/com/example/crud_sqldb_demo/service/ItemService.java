package com.example.crud_sqldb_demo.service;

import com.example.crud_sqldb_demo.entity.Item;

import java.util.List;

public interface ItemService {
    public Item saveItem(Item item);
    public Item getItem(int id);
    public Item updateItem(Item item);
    public void deleteItem(int id);
    public List<Item> getAllItems();
}
