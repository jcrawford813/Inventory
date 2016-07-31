package com.mycodinglife.inventory;

import com.mycodinglife.inventory.dao.InventoryItemDao;
import com.mycodinglife.inventory.entities.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The REST service for items.
 * @author jim
 */
@RestController
public class ItemController {
    public ItemController(InventoryItemDao itemDao) {
        this.itemDao = itemDao;
    }
    
    public ItemController() {
        this.itemDao = null;
    }
    
    private final InventoryItemDao itemDao;
    
    @RequestMapping(path="/item", method=RequestMethod.GET)
    public InventoryItem get() {
        InventoryItemType type = new InventoryItemType(1, "Test Type", 
                "This is a placeholder type.");
        InventoryItem item = new InventoryItem("New Inventory Item", 
                "An item that is being added to the inventory.", type);
        
        return item;
    }
}
