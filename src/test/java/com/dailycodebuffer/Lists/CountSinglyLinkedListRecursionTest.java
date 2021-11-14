package com.dailycodebuffer.Lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class CountSinglyLinkedListRecursionTest {
    
    private CountSinglyLinkedListRecursion list;
    
    @BeforeEach
    void init() {
        list = new CountSinglyLinkedListRecursion();
    }
    
    @Test
    public void countElements() {
        list.insert(10);
        list.insert(0);
        list.insert(100);
        list.insert(210);
        list.insert(130);
        list.insert(105);
        Assertions.assertEquals(6, list.count());
        Assertions.assertEquals(6, list.size());
        
    }
    
    @Test
    public void countListWithoutElements() {
        Assertions.assertEquals(0, list.size());
        Assertions.assertEquals(0, list.count());
    }
}
