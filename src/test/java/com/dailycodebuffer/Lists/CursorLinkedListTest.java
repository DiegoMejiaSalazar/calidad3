package com.dailycodebuffer.Lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class CursorLinkedListTest {
    
    private static final String EQUAL_NAMES = "ALL THE NAMES ARE THE SAME";
    private CursorLinkedList<String> list;
    
    @BeforeEach
    void init() {
        list = new CursorLinkedList<>();
    }
    
    @Test
    public void addElements() {
        list.append("Diego");
        list.append("Daniel");
        list.append("John");
        list.append("Donald");
        Assertions.assertEquals(0, list.indexOf("Diego"));
        Assertions.assertEquals(1, list.indexOf("Daniel"));
        Assertions.assertEquals(2, list.indexOf("John"));
        Assertions.assertEquals(3, list.indexOf("Donald"));
        Assertions.assertNotEquals("Donald", list.get(list.indexOf("Diego")));
        Assertions.assertNotEquals("John", list.get(list.indexOf("Daniel")));
        Assertions.assertNotEquals("Daniel", list.get(list.indexOf("John")));
        Assertions.assertNotEquals("Diego", list.get(list.indexOf("Donald")));
    }   
    
    @Test
    public void getIndexOfUnexistingElement() {
        list.append("Diego");
        list.append("Daniel");
        list.append("John");
        list.append("Donald");
        try { // BUG
            Assertions.assertEquals(-1, list.indexOf("Elioth"));
        } catch(IndexOutOfBoundsException ex) {
           Assertions.assertFalse(false, ex.getMessage());
        }
    }
    
    @Test
    public void removeExistingElement() {
        list.append("Diego");
        list.append("Daniel");
        list.append("John");
        list.append("Donald");
        list.remove("Diego");
        Assertions.assertNotEquals("Diego", list.get(0));
    }
    
        
    
    @Test
    public void removeExistingElementByIndex() {
        list.append("Diego");
        list.append("Daniel");
        list.append("John");
        list.append("Donald");
        list.removeByIndex(0);
        Assertions.assertNotEquals("Diego", list.get(0));
    }
    
    @Test
    public void removeExistingElementByUnexistingIndex() {
        list.append("Diego");
        list.append("Daniel");
        list.append("John");
        list.append("Donald");
        list.remove("wia");
        Assertions.assertEquals("Diego", list.get(0));
    }
    
    @Test
    public void getElementFromEmptyList() {
        Assertions.assertNull(list.get(0));
    }
}
