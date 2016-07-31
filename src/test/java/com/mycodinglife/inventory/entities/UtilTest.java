package com.mycodinglife.inventory.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jim
 */
public class UtilTest {
    
    public UtilTest() {
    }

    /**
     * Test of cleanString method, of class Util using a null string.
     */
    @Test
    public void testCleanString_null() {
        System.out.println("cleanString with null input");
        String text = null;
        String expResult = "";
        String result = Util.cleanString(text);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCleanString_empty() {
        System.out.println("cleanString with empty input");
        String text = "";
        String expResult = "";
        String result = Util.cleanString(text);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCleanString_spaces() {
        System.out.println("cleanString with preceding and trailing spaces");
        String text = " test ";
        String expResult = "test";
        String result = Util.cleanString(text);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCleanString_content() {
        System.out.println("cleanString with content");
        String text = "test";
        String expResult = "test";
        String result = Util.cleanString(text);
        assertEquals(expResult, result);
    }
}
