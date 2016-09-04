/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycodinglife.inventory.entities;

/**
 * The data types that the system uses for input.
 * @author jim
 */
public enum InventoryItemFieldDataType {
    /**
     * Input of a string of letters and numbers.
     */
    String,
    /**
     * Numeric input
     */
    Number,
    /**
     * Input of a date.
     */
    Date,
    /** 
     * Input of a file.
     */
    File
}
