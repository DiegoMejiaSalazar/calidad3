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
    
    @Test
    public void testAddFiveElement() {
        bag.add("Diego");
        bag.add("Daniel");
        bag.add("Daniela");
        bag.add("Pepe");
        bag.add("Juan");
        Assertions.assertEquals(false, bag.isEmpty());
        Assertions.assertEquals(true, bag.contains("Diego"));
        Assertions.assertEquals(true, bag.contains("Daniel"));
        Assertions.assertEquals(true, bag.contains("Daniela"));
        Assertions.assertEquals(true, bag.contains("Pepe"));
        Assertions.assertEquals(true, bag.contains("Juan"));
        Assertions.assertEquals(5, bag.size());
    }
    
        @Test
    public void testIfContainsUnExsitingElement() {
        bag.add("Diego");
        bag.add("Daniel");
        bag.add("Daniela");
        bag.add("Pepe");
        bag.add("Juan");
        Assertions.assertEquals(false, bag.isEmpty());
        //Assertions.assertEquals(true, bag.contains("Oswaldo"));
        Assertions.assertEquals(5, bag.size());
    }
}
