/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailycodebuffer.Heaps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Andy_
 */
public class HeapElementTests {

    private HeapElement element, element2, element3, element4, element5, element6, element7, element8;
    private Object info = "add info";
    private Object heapelem;
    private Integer keyI = 2;
    private Double keyD = 3.0;

    @BeforeEach
    void init() {
        heapelem = new HeapElement(3, info);
        element = new HeapElement(2.0, info);
        element2 = new HeapElement(3, info);
        element3 = new HeapElement(keyI, info);
        element4 = new HeapElement(keyD, null);
        element5 = new HeapElement(2);
        element6 = new HeapElement(2.0);
        element7 = new HeapElement(keyI);
        element8 = new HeapElement(keyD);
    }

    @Test
    public void getInfoHeapElement() {
        Assertions.assertEquals(info, element.getInfo());
    }

    @Test
    public void getKeyHeapElement() {
        Assertions.assertEquals(3, element2.getKey());
    }

    @Test
    public void toStringHeapElement() {
        Assertions.assertEquals("Key: 3.0 - add info", element2.toString());
    }

    @Test
    public void equalsHeapElement() {
        Assertions.assertFalse(element.equals(null));
        Assertions.assertTrue(element2.equals(heapelem));
        Assertions.assertFalse((element.equals(info)));
    }

    @Test
    public void hashCodeHeapElement() {
        Assertions.assertEquals(-1294329558, element2.hashCode());
        Assertions.assertEquals(93, element4.hashCode());

    }

}
