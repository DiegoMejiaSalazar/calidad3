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
public class MRUCacheTest {
       
    private MRUCache<String, String> cache;
    
    @BeforeEach
    void init(){
        cache = new MRUCache();
    }
    
    @Test
    public void testAddFiveElements() {
        cache.put("Estudiante1", "Alejandra");
        Assertions.assertEquals("Alejandra", cache.get("Estudiante1"));   
    }
}
