/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailycodebuffer.Heaps;

import com.dailycodebuffer.HashMap.Hashing.HashMap;
import com.dailycodebuffer.HashMap.Hashing.HashMapLinearProbing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Andy_
 */
public class EmptyHeapExceptionTests {

    private Exception Ex;

    @BeforeEach
    void init() {

        Ex = new EmptyHeapException("Error: Empty Heap");
    }

    @Test
    public void exceptionHeap() {

        Assertions.assertEquals("Error: Empty Heap", Ex.getMessage());
    }
}
