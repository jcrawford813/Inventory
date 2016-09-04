/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycodinglife.inventory;

import com.mycodinglife.inventory.entities.InventoryItem;
import com.mycodinglife.inventory.entities.InventoryItemType;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jim
 */
public class ItemControllerTest {
    
    public ItemControllerTest() {
    }
    
    private ItemController controller;
    
    @Before
    public void setUpTest() {
        this.controller = new ItemController(new InventoryItemDaoMock());
    }
    
    @After
    public void tearDownTest() {
        this.controller = null;
    }

    @Test
    public void testGet_NoFilter() {
        List<InventoryItem> items = this.controller.get();
        int expected = 4;
        assertEquals(expected, items.size());
    }
    
    @Test
    public void testGet_Filter() {
        String filter = "Test";
        List<InventoryItem> items = this.controller.get(filter);
        int expected = 2;
        assertEquals(expected, items.size());
    }
    
    @Test
    public void testGet_NoMatch() {
        String filter = "No way this matches";
        List<InventoryItem> items = this.controller.get(filter);
        assertTrue(items.isEmpty());
    }
    
    @Test
    public void testGet_ById() {
        int id = 1;
        InventoryItem item = this.controller.get(id);
        assertTrue(item != null);
    }
    
    @Test
    public void testGet_ByIdNoMatch() {
        int id = 123;
        InventoryItem item = this.controller.get(id);
        assertTrue(item == null);
    }
    
    @Test
    public void testPost() {
        InventoryItemType type = new InventoryItemType(2, "Test Type", "Test");
        InventoryItem item = new InventoryItem("New Test Item", 
                "This is a new test item to test the POST.", type);
        int expectedId = 5;
        int actualId = this.controller.post(item);
        assertEquals(expectedId, actualId);
    }
    
    @Test
    public void testPut() {
        InventoryItemType type = new InventoryItemType(2, "Test Type", "Test");
        InventoryItem item = new InventoryItem(3, "New Test Item", 
                "This is a new test item to test the POST.", type,
                LocalDateTime.now(), LocalDateTime.now());
        int expectedId = 3;
        int actualId = this.controller.put(item);
        assertEquals(expectedId, actualId);
    }
    
    @Test
    public void testDelete() {
        int id = 2;
        this.controller.delete(id);
        assertTrue(true);
    }
    
    @Test
    public void testDelete_NonExistantRecord() {
        try {
            int id = 7;
            this.controller.delete(id);
            fail("This should not happen.");
        } catch (IndexOutOfBoundsException e) {
            assertNotNull(e);
        }  
    }
}
