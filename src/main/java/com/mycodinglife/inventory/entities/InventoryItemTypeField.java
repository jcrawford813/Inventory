/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycodinglife.inventory.entities;

/**
 * Represents a field that is associated to an inventory item type.
 * @author jim
 */
public final class InventoryItemTypeField {
    public InventoryItemTypeField() {
        this.id = 0;
    }
    
    public InventoryItemTypeField(int id, String name, String description, InventoryItemFieldDataType type) {
        this.id = id;
        this.setName(name);
        this.setDescription(description);
        this.setType(type);
    }
    
    //Private Members
    private final int id;
    private String name;
    private String description;
    private InventoryItemFieldDataType type;
    
    //Public Members and Methods
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = Util.cleanString(name);
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = Util.cleanString(description);
    }
    
    public InventoryItemFieldDataType getType() {
        return this.type;
    }
    
    public void setType(InventoryItemFieldDataType type) {
        this.type = type;
    }
}
