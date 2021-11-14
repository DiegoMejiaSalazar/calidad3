/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.Lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author User
 */
public class SinglyLinkedListTest {

    private SinglyLinkedList list;

    @BeforeEach
    public void init() {
        list = new SinglyLinkedList();
    }

    @Test
    public void searchEmptyList() {
        Assertions.assertTrue(list.isEmpty());
        Assertions.assertEquals(0, list.count());
        Assertions.assertEquals(0, list.size());
        Assertions.assertEquals("", list.toString());
    }

    @Test
    public void insertElements() {
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        list.insertNth(1, 4);
        Assertions.assertEquals("10->7->5->3->1", list.toString());
        Assertions.assertTrue(list.search(10));
        Assertions.assertTrue(list.search(5));
        Assertions.assertTrue(list.search(1));
        Assertions.assertFalse(list.search(100));
        Assertions.assertEquals(10, list.getNth(0));
        Assertions.assertEquals(5, list.getNth(2));
        Assertions.assertEquals(1, list.getNth(4));
    }

    @Test
    public void removeElements() {
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        list.insertNth(1, 4);
        list.deleteHead();
        list.deleteNth(1);
        list.delete();
        Assertions.assertEquals("7->3", list.toString());
        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals(2, list.count());
    }
    
    @Test
    public void clearList() {
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        list.insertNth(1, 4);
        list.swapNodes(5, 7);
        list.clear();
        Assertions.assertTrue(list.isEmpty());
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.delete());
    }
    
        
    @Test
    public void detectLoop() {
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        list.insertNth(1, 4);
        list.detectLoop();
        Assertions.assertFalse(list.isEmpty());
    }
    
    @Test
    public void reverse() {
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        list.insertNth(1, 4);
        list.reverseList(list.getHead().next.next);
        Assertions.assertFalse(list.isEmpty());
    }
}
