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
    private LRUCache<String, String> limitCache; 
    
    @BeforeEach
    void init(){
        cache = new LRUCache();
        limitCache = new LRUCache(5);
    }
    
    @Test
    public void testAddFiveElements() {
        cache.put("Estudiante1", "Alejandra");
        cache.put("Estudiante2", "Alejandro");
        cache.put("Estudiante3", "Diego");
        cache.put("Estudiante4", "Andy");
        cache.put("Estudiante5", "Alan");
        Assertions.assertEquals("Alejandra", cache.get("Estudiante1"));
        Assertions.assertEquals("Alejandro", cache.get("Estudiante2"));
        Assertions.assertEquals("Diego", cache.get("Estudiante3"));
        Assertions.assertEquals("Andy", cache.get("Estudiante4"));
        Assertions.assertEquals("Alan", cache.get("Estudiante5"));
    }
    
    @Test
    public void testCapacity(){
        limitCache.put("Estudiante1", "Alejandra");
        limitCache.put("Estudiante2", "Alejandro");
        limitCache.put("Estudiante3", "Diego");
        limitCache.put("Estudiante4", "Andy");
        limitCache.put("Estudiante5", "Alan");
        limitCache.put("Estudiante6", "Alanis");
        limitCache.put("Estudiante7", "Pepe");
        Assertions.assertNull(limitCache.get("Estudiante1"));
        Assertions.assertNull(limitCache.get("Estudiante2"));
    }
    @Test
    public void ifExistKey()
    {
        limitCache.put("Estudiante1", "Alejandra");
        limitCache.put("Estudiante1", "Diego");
        Assertions.assertEquals("Diego",limitCache.get("Estudiante1"));
        Assertions.assertNotEquals("Alejandra", limitCache.get("Estudiante1"));
    }
    @Test
    public void capacityLowerThanZero() {
       RuntimeException exeption = Assertions.assertThrows(RuntimeException.class, ()->new LRUCache(-1));
       Assertions.assertEquals("capacity must greater than 0!", exeption.getMessage());
    }
}
