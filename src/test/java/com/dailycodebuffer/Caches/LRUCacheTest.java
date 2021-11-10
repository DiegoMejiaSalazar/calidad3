/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.Caches;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author DELL
 */
public class LRUCacheTest {
    
    private LRUCache<String, String> cache;
    
    @BeforeEach
    void init(){
        cache = new LRUCache();
    }
    
    @Test
    public void testAddOneKey() {
        cache.put("Nombre","Alejandra");
        Assertions.assertEquals("Alejandra",cache.get("Nombre"));
        //Assertions.assertEquals(false, bag.isEmpty());
       
    }
}
