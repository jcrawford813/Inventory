package com.mycodinglife.inventory.entities;

import java.time.LocalDateTime;

/**
 *
 * Represents an item in the inventory.
 */
public class InventoryItem {
    /**
     * Creates a new instance of the InventoryItem class.
     * @param name the name of the item.
     * @param description a description of the item.
     * @param type the type of the item.
     */
    public InventoryItem(String name, String description, 
            InventoryItemType type) {
        this.id = 0;
        this.setName(name);
        this.setDescription(description);
        this.type = type;
        this.dateAdded = LocalDateTime.now();
        this.dateModified = LocalDateTime.now();
    }
    
    public InventoryItem(int id, String name, String description,
            InventoryItemType type, LocalDateTime dateAdded, 
            LocalDateTime dateModified) {
        this(name, description, type);
        this.id = id;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }
    
    /* Private Members */
    private int id;
    private String name;
    private String description;
    private final InventoryItemType type;
    private LocalDateTime dateAdded;
    private LocalDateTime dateModified;
    
    /* Getters / Setters */
    
    /**
     * Gets the id of the inventory item.
     * @return int
     */
    public final int getId() {
        return id;
    }
    
    /**
     * Gets the name of the item.
     * @return String
     */
    public final String getName() {
        return this.name;
    }
    
    /**
     * Gets the type of inventory item.
     * @return InventoryItemType
     */
    public final InventoryItemType getType() {
        return this.type;
    }
    
    /**
     * Sets the name of the item.
     * @param name is the name to set.
     */
    public final void setName(String name) {
        this.name = Util.cleanString(name);
    }
    
    /**
     * Gets the description of the item.
     * @return String
     */
    public final String getDescription() {
        return this.description;
    }
    
    /**
     * Sets the description of the item.
     * @param description is the description to set.
     */
    public final void setDescription(String description) {
        this.description = Util.cleanString(description);
    }
    
    /**
     * Gets the date the item was added.
     * @return LocalDateTime
     */
    public final LocalDateTime getDateAdded() {
        return this.dateAdded;
    }
    
    /**
     * Gets the date the item was last modified.
     * @return LocalDateTime
     */
    public final LocalDateTime getDateModified() {
        return this.dateModified;
    }
    
}
