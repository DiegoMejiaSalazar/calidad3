/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailycodebuffer.dynamicarray;

import com.dailycodebuffer.Bags.Bag;
import com.dailycodebuffer.DynamicArray.DynamicArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Andy_
 */
public class DynamicArrayTest {
    
    private DynamicArray<String> departments;
    
    @BeforeEach
    void init(){
        departments = new DynamicArray<>();
    }
    
    
    @Test
    public void addOneElement(){   
        departments.add("Cochabamba");
        Assertions.assertEquals("Cochabamba",departments.get(0));
        Assertions.assertEquals(1,departments.getSize());
    }
    

}
