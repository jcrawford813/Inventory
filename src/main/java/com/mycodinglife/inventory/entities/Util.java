/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycodinglife.inventory.entities;

/**
 * Contains utility methods for use through the application.
 * @author jim
 */
public class Util {
    /**
     * Cleans a given string for use in the application.
     * @param text the string to clean.
     * @return String
     */
    public static String cleanString(String text) {
        if (null == text) {
            return "";
        }
        
        return text.trim();
    }
}
