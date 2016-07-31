package com.mycodinglife.inventory.entities;

/**
 * Represents a type of item in the inventory.
 */
public final class InventoryItemType {
    public InventoryItemType(int id, String name, String description) {
        this.id = id;
        this.setName(name);
        this.setDescription(description);
    }
    
    /* Private Members */
    private final int id;
    private String name;
    private String description;
    
    /* Getters / Setters */
    
    /**
     * Gets the id of the item type.
     * @return int
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Gets the name of the type.
     * @return String
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Sets the name of the type.
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = Util.cleanString(name);
    }
    
    /**
     * Gets the description of the type.
     * @return String
     */
    public String getDescription() {
        return this.description;
    }
    
    /**
     * Sets the description of the type.
     * @param description the description to set.
     */
    public void setDescription(String description) {
        this.description = Util.cleanString(description);
    }
}
