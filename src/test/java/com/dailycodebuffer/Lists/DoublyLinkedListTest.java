/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.Lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class DoublyLinkedListTest {
    
    private DoublyLinkedList list;
    
    @BeforeEach
    void init() {
        list = new DoublyLinkedList();
    }
    
    @Test
    public void insertToTheHeadThreeElements() {
        list.insertHead(13);
        list.insertHead(7);
        list.insertHead(10);
        list.display();
        list.displayBackwards();
        Assertions.assertFalse(list.isEmpty());
    }
    
    @Test
    public void insertToTailThreeElements() {
        list.insertTail(10);
        list.insertTail(100);
        list.insertTail(1000);
        list.display();
        list.displayBackwards();
        Assertions.assertFalse(list.isEmpty());
    }
    
    
    @Test
    public void deleteElementsFromTail() {
        list.insertTail(10);
        list.insertTail(100);
        list.insertTail(1000);
        Link link1 = list.deleteTail();
        Link link2 = list.deleteTail();
        Link link3 = list.deleteTail();
        Assertions.assertEquals(1000, link1.value);
        Assertions.assertNotNull(link1.previous);
        Assertions.assertNull(link1.next);
        Assertions.assertEquals(100, link2.value);
        Assertions.assertNotNull(link2.previous);
        Assertions.assertNull(link2.next);
        Assertions.assertEquals(10, link3.value);
        Assertions.assertNull(link3.previous);
        Assertions.assertNull(link3.next);
        list.display();
        list.displayBackwards();
        Assertions.assertTrue(list.isEmpty());
    }
    
    @Test
    public void insertInOrder() {
        list.insertOrdered(0);
        list.insertOrdered(560);
        list.insertOrdered(58);
        list.insertOrdered(26);
        list.insertOrdered(50);
        list.insertOrdered(9);
        list.insertOrdered(300);
        Assertions.assertAll(
                () -> Assertions.assertEquals(560, list.deleteTail().value),
                () -> Assertions.assertEquals(300, list.deleteTail().value),
                () -> Assertions.assertEquals(58, list.deleteTail().value),
                () -> Assertions.assertEquals(50, list.deleteTail().value),
                () -> Assertions.assertEquals(26, list.deleteTail().value),
                () -> Assertions.assertEquals(9, list.deleteTail().value),
                () -> Assertions.assertEquals(0, list.deleteTail().value)
        );
    }
    
    @Test
    public void insertInOrderNullValues() {
        list.insertOrdered(20);
        list.insertOrdered(2);
        Assertions.assertAll(
                () -> Assertions.assertEquals(20, list.deleteTail().value),
                () -> Assertions.assertEquals(2, list.deleteTail().value)
        );
    }
    
    @Test
    public void clearList() {
        list.insertOrdered(50);
        list.insertOrdered(9);
        list.insertOrdered(300);
        list.insertTail(10);
        list.insertTail(100);
        list.insertTail(1000);
        list.insertHead(13);
        list.insertHead(7);
        list.insertHead(10);
        list.clearList();
        Assertions.assertTrue(list.isEmpty());
    }
    
    @Test
    public void insertElementsByIndex() {
        list.insertHead(50);
        list.insertHead(9);
        list.insertHead(300);
        list.insertHead(10);
        list.insertHead(100);
        list.insertHead(1000);
        list.insertHead(13);
        list.insertHead(7);
        list.insertHead(10);
        list.insertElementByIndex(7000, 0);
        Assertions.assertNotEquals(7, list.deleteHead().value);
        Assertions.assertEquals(10, list.deleteHead().value);
        list.insertElementByIndex(788, 9);
        Assertions.assertEquals(788, list.deleteTail().value);
        list.insertElementByIndex(40, 2);
        list.deleteHead();
        list.deleteHead();
        Assertions.assertEquals(40, list.deleteHead().value);
    }
    
    @Test
    public void insertElementInInvalidPosition() {
        list.insertHead(50);
        list.insertHead(9);
        list.insertHead(300);
        list.insertHead(10);
        list.insertHead(100);
        list.insertHead(1000);
        list.insertHead(13);
        list.insertHead(7);
        list.insertHead(10);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.insertElementByIndex(10, 30));
    }
    
    @Test
    public void reverseElements() {
        int[] elementstoadd = {10,20,30,40,50};
        DoublyLinkedList list1 = new DoublyLinkedList(elementstoadd);
        list1.reverse();
        Assertions.assertNotEquals(10, list1.deleteHead());
        Assertions.assertNotEquals(50, list1.deleteTail());
    }
    
    @Test //BUG
    @Disabled
    public void removeDuplites() {
        try {
            list.insertHead(10);
            list.insertHead(10);
            list.insertHead(10);
            list.insertHead(10);
            list.insertHead(10);
            DoublyLinkedList.removeDuplicates(list);
            Assertions.assertFalse(list.isEmpty());
        } catch (NullPointerException ex) {
            Assertions.assertFalse(true, ex.getMessage());
        }
    }
    
    @Test
    public void initializaWithEmptyArray() {
        Assertions.assertThrows(NullPointerException.class, () -> new DoublyLinkedList(null));
    }
    
    @Test
    public void reverseListOfFiveElements() {
        list.insertHead(10);
        list.insertHead(20);
        list.insertHead(30);
        list.insertHead(40);
        list.insertHead(50);
        list.reverse();
        Assertions.assertAll(
                () -> Assertions.assertEquals(10, list.deleteHead().value),
                () -> Assertions.assertEquals(50, list.deleteTail().value)
        );
        
    }
    
    @Test
    public void deletetTailNode() {
        list.insertTail(10);
        list.insertTail(20);
        list.insertTail(30);
        list.insertTail(40);
        list.insertTail(50);
        list.delete(50);
        list.display();
        Assertions.assertEquals(40, list.deleteTail().value);
    }
    
    @Test
    public void deletetMiddleElement() {
        list.insertTail(10);
        list.insertTail(20);
        list.insertTail(30);
        list.insertTail(40);
        list.insertTail(50);
        list.delete(30);
        Assertions.assertEquals(10, list.deleteHead().value);
        Assertions.assertEquals(50, list.deleteTail().value);
        Assertions.assertFalse(list.isEmpty());
    }
    
    @Test
    public void deleteUnExistingElement() {
        list.insertTail(10);
        list.insertTail(11);
        list.insertTail(12);
        Assertions.assertThrows(RuntimeException.class, () -> list.delete(13));
    }
    
    @Test
    public void deleteFromEmptyList() {
        Assertions.assertThrows(NullPointerException.class, () -> list.deleteHead());
    }
    
    @Test
    public void deleteOnlyElement() {
        list.insertHead(1);
        Assertions.assertDoesNotThrow(() -> list.delete(1));
    }
}
