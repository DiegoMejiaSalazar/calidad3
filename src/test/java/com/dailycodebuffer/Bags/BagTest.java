package com.dailycodebuffer.Bags;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */

public class BagTest {
    
    private Bag<String> bag;
    
    @BeforeEach
    void init(){
        bag = new Bag();
    }
    
    @Test
    public void testAddOneElement() {
        bag.add("Diego");
        Assertions.assertEquals(false, bag.isEmpty());
        Assertions.assertEquals(true, bag.contains("Diego"));
        Assertions.assertEquals(1, bag.size());
    }
}
