/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycodinglife.inventory.entities;

import java.time.LocalDateTime;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jim
 */
public class InventoryItemTest {
    
    public InventoryItemTest() {
        
    }
    
    @Before
    public void setupItems() {
        InventoryItemType type = new InventoryItemType(1, "Test Type", "This type is only used for tests.");
        
        this.currentTime = LocalDateTime.now();
        
        this.existingItem = new InventoryItem(2, "Test Item", "", type, 
                this.currentTime, 
                this.currentTime);
    }
    
    @After
    public void destroyItems() {
        this.existingItem = null;
    }
    
    private LocalDateTime currentTime;
    private InventoryItem existingItem;

    @Test
    public void testGetId_Existing() {
        int expResult = 2;
        int result = existingItem.getId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetName_Existing() {
        String expResult = "Test Item";
        String result = existingItem.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetType_Existing() {
        InventoryItemType result = existingItem.getType();
        assertEquals("Test Type", result.getName());
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "New Name";
        existingItem.setName(name);
        assertEquals(name, existingItem.getName());
    }

    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "";
        String result = existingItem.getDescription();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "Set me";
        existingItem.setDescription(description);
        assertEquals(description, existingItem.getDescription());
    }

    @Test
    public void testGetDateAdded() {
        System.out.println("getDateAdded");
        LocalDateTime expResult = this.currentTime;
        LocalDateTime result = existingItem.getDateAdded();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDateModified() {
        System.out.println("getDateModified");
        LocalDateTime expResult = this.currentTime;
        LocalDateTime result = existingItem.getDateModified();
        assertEquals(expResult, result);
    }
    
}
