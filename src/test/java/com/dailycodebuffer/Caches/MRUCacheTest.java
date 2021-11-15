/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dailycodebuffer.Caches;

import com.dailycodebuffer.HashMap.Hashing.HashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

/**
 * 
 * @author DELL
 */
public class MRUCacheTest {
    private MRUCache<String, String> cache;
    private MRUCache<String, String> limitCache;

    @BeforeEach
    void init(){
        cache = new MRUCache();
        limitCache = new MRUCache(5);
    }
    
    @Test
    public void testAddForElements() {
        cache.put("Estudiante1", "Alejandra");
        cache.put("Estudiante2", "Alejandro");
        cache.put("Estudiante3", "Diego");
        cache.put("Estudiante4", "Andy");
        Assertions.assertEquals("Alejandra", cache.get("Estudiante1"));
        Assertions.assertEquals("Alejandro", cache.get("Estudiante2"));
        Assertions.assertEquals("Diego", cache.get("Estudiante3"));
        Assertions.assertEquals("Andy", cache.get("Estudiante4"));
    }
    
    @Test
    public void capacityLowerThanZero() {
       RuntimeException exeption = Assertions.assertThrows(RuntimeException.class, ()->new MRUCache(-1));
       Assertions.assertEquals("capacity must greater than 0!", exeption.getMessage());
    }
    
    @Test
    public void ifExistKey() {
        limitCache.put("Estudiante1", "Carlos");
        limitCache.put("Estudiante1", "Paola");
        Assertions.assertEquals("Paola",limitCache.get("Estudiante1"));
    }
    
    @Test
    public void getNullInOneKey(){
        Assertions.assertNull(limitCache.get("Estudiante1"));
    }
    
    @Test
    @Disabled
    public void testCapacity(){
        limitCache.put("Estudiante1", "Alejandra");
        limitCache.put("Estudiante2", "Alejandro");
        limitCache.put("Estudiante3", "Diego");
        limitCache.put("Estudiante4", "Andy");
        limitCache.put("Estudiante5", "Alan");
        limitCache.put("Estudiante6", "Alanis");
        limitCache.put("Estudiante7", "Pepe");
        Assertions.assertNull(limitCache.get("Estudiante6"));
    }
}
