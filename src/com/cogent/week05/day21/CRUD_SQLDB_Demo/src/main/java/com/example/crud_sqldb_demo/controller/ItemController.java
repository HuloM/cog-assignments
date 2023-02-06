package com.example.crud_sqldb_demo.controller;

import com.example.crud_sqldb_demo.entity.Item;
import com.example.crud_sqldb_demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiv1")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> getItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/item/{id}")
    public Item getItem(@PathVariable int id) {
        return itemService.getItem(id);
    }

    @PutMapping("/item/{id}")
    public Item updateItem(@Validated @RequestBody Item item) {
        return itemService.updateItem(item);
    }

    @PostMapping("/item")
    public Item saveItem(@Validated @RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @DeleteMapping("/item/{id}")
    public void deleteItem(int id) {
        itemService.deleteItem(id);
    }



}
