package com.dailycodebuffer.Bags;

import java.util.NoSuchElementException;
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
        Assertions.assertEquals(false, bag.contains("Oswaldo"));
        Assertions.assertEquals(5, bag.size());
    }
    
    @Test
    public void testIfElementExistInEmptyBag() {
        Assertions.assertEquals(true, bag.isEmpty());
        Assertions.assertEquals(false, bag.contains("Oswaldo"));
        Assertions.assertEquals(0, bag.size());
    }
    
    @Test
    public void testGetNextOfEmptyBag() {
        Assertions.assertEquals(true, bag.isEmpty());
        Assertions.assertEquals(0, bag.size());
        NoSuchElementException exception = Assertions.assertThrows(
                NoSuchElementException.class,
                () -> bag.iterator().next());
        
    }
    
    @Test
    public void testCannotRemoveElementOfBag() {
        Assertions.assertEquals(true, bag.isEmpty());
        Assertions.assertEquals(0, bag.size());
        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> bag.iterator().remove()
        );
        
    }
}
