/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailycodebuffer.dynamicarray;

import com.dailycodebuffer.DynamicArray.DynamicArray;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Andy_
 */
public class DynamicArrayTest {
    
    private DynamicArray<String> departments,departments1;
    private List<String> addedDepartments;
    @BeforeEach
    void init(){
        departments = new DynamicArray<>();
        departments1= new DynamicArray<>(3);
        addedDepartments = new ArrayList<>();
    }
 
    @Test
    public void addOneElement(){   
        departments.add("Cochabamba");
        Assertions.assertEquals("Cochabamba",departments.get(0));
        Assertions.assertEquals(1,departments.getSize());
    }
    @Test
    public void addElements(){   
        departments1.add("Cochabamba");
        departments1.add("LaPaz");
        departments1.add("Sta Cruz");
        departments1.add("Oruro");    
    }
    @Test
    public void putElement(){
    
    departments.put(1,"SantaCruz");
    Assertions.assertEquals("SantaCruz",departments.get(1));
    }
    
    @Test
    public void removeElement(){
        departments.add("LaPaz");
        departments.add("Beni");
        departments.remove(0);
        departments.remove(4);
        
    }
     @Test
    public void emptyArray(){
        Assertions.assertTrue(departments.isEmpty());
        departments.add("LaPaz");
        departments.add("Beni");
        Assertions.assertFalse(departments.isEmpty());
        addedDepartments.add("LaPaz");
        addedDepartments.add("Beni");
        departments.stream().forEach(x -> Assertions.assertTrue(addedDepartments.contains(x)));
        for (String department: departments){
            Assertions.assertTrue(addedDepartments.contains(department));
        }            
        
    }
}
