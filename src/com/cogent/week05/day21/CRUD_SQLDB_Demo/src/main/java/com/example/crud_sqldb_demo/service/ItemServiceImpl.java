package com.example.crud_sqldb_demo.service;

import com.example.crud_sqldb_demo.entity.Item;
import com.example.crud_sqldb_demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item getItem(int id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item updateItem(Item item) {
        return itemRepository.existsById(item.getId()) ? itemRepository.save(item) : null;
    }

    @Override
    public void deleteItem(int id) {
        itemRepository.deleteById(id);
    }

    @Override
    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }
}
