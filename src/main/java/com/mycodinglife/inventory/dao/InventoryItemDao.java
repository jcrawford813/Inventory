package com.mycodinglife.inventory.dao;

import com.mycodinglife.inventory.entities.InventoryItem;

/**
 * Defines the methods and members for data access for inventory items.
 * @author jim
 */
public interface InventoryItemDao {
    /**
     * Gets an inventory item by id.
     * @param id the id of the item.
     * @return InventoryItem
     */
    InventoryItem get(int id);
    
    /**
     * Saves an inventory item.
     * @param item the item to save.
     * @return the int identifier.
     */
    int saveItem(InventoryItem item);
    
    /**
     * Deletes an inventory item.
     * @param id the id to delete.
     */
    void deleteItem(int id);
}
