/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycodinglife.inventory;

import com.mycodinglife.inventory.dao.InventoryItemDao;
import com.mycodinglife.inventory.entities.InventoryItem;
import com.mycodinglife.inventory.entities.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jim
 */
public class InventoryItemDaoMock
    implements InventoryItemDao {
    
    public InventoryItemDaoMock() {
        items = new ArrayList<>();
        InventoryItemType type1 = new InventoryItemType(1, "Type 1", "Type 1");
        InventoryItemType type2 = new InventoryItemType(2, "Type 2", "Type 2");
        
        items.add(new InventoryItem(1, "Test Item 1", "Test Item", type1,
            LocalDateTime.now(), LocalDateTime.now()));
        items.add(new InventoryItem(2, "Test Item 2", "Test Item", type2,
            LocalDateTime.now(), LocalDateTime.now()));
        items.add(new InventoryItem(3, "Another Item 1", "Another Item 1",
            type1, LocalDateTime.now(), LocalDateTime.now()));
        items.add(new InventoryItem(4, "Another Item 2", "Another Item 2",
            type2, LocalDateTime.now(), LocalDateTime.now()));
    }
    
    private final List<InventoryItem> items;
    
    @Override
    public List<InventoryItem> get(String filter) {
        List<InventoryItem> matches = new ArrayList<>();
        for (InventoryItem item : items) {
            if (item.getName().toLowerCase().contains(filter.toLowerCase())) {
                matches.add(item);
            }
        }
        
        return matches;
    }

    @Override
    public InventoryItem get(int id) {
        for (InventoryItem item: items) {
            if (item.getId() == id) {
                return item;
            }
        }
        
        return null;
    }

    @Override
    public int saveItem(InventoryItem item) {
        if (item.getId() == 0) {
            return 5;
        } else {
            return item.getId();
        }
    }

    @Override
    public void deleteItem(int id) {
        if (get(id) == null) {
            throw new IndexOutOfBoundsException();
        }
    }
    
}
