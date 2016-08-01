package com.mycodinglife.inventory.dao;

import com.mycodinglife.inventory.entities.InventoryItem;
import java.util.List;

/**
 * Defines the methods and members for data access for inventory items.
 * @author jim
 */
public interface InventoryItemDao {
    /**
     * Gets a listing of all inventory items via filter.
     * @param filter a string filter used to compare.
     * @return a list of InventoryItems
     */
    List<InventoryItem> get(String filter);
    
    /**
     * Gets an inventory item by id.
     * @param id the id of the item.
     * @return InventoryItem
     */
    InventoryItem get(int id);
    
    /**
     * Saves an inventory item.
     * @param item the item to save.
     * @return the integer identifier.
     */
    int saveItem(InventoryItem item);
    
    /**
     * Deletes an inventory item.
     * @param id the id to delete.
     */
    void deleteItem(int id);
}
