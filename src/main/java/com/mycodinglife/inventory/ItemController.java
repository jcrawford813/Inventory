package com.mycodinglife.inventory;

import com.mycodinglife.inventory.dao.InventoryItemDao;
import com.mycodinglife.inventory.entities.*;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The REST service for items.
 * @author jim
 */
@RestController
@RequestMapping("/item")
public class ItemController {
    public ItemController(InventoryItemDao itemDao) {
        this.itemDao = itemDao;
    }
    
    public ItemController() {
        this.itemDao = null;
    }
    
    private final InventoryItemDao itemDao;
    
    @RequestMapping(path="filter/{filter}", method=RequestMethod.GET)
    public List<InventoryItem> get(@PathVariable String filter) {
        return this.itemDao.get(filter);
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public List<InventoryItem> get() {
        return this.itemDao.get("");
    }
    
    @RequestMapping(path="{id}", method=RequestMethod.GET)
    public InventoryItem get(@PathVariable int id) {
        return this.itemDao.get(id);
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public int post(InventoryItem item) {
        return this.itemDao.saveItem(item);
    }
    
    @RequestMapping(method=RequestMethod.PUT)
    public int put(InventoryItem item) {
        return this.itemDao.saveItem(item);
    }
    
    @RequestMapping(path="{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        this.itemDao.deleteItem(id);
    }
}
