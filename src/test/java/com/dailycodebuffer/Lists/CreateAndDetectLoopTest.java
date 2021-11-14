package com.dailycodebuffer.Lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class CreateAndDetectLoopTest {

    private SinglyLinkedList singlyLinkedList;
    
    @BeforeEach
    void init() {
        singlyLinkedList = new SinglyLinkedList();
    }
    
    
    @Test
    public void detectExistingLoopWithElements() {
        singlyLinkedList.insert(10);
        singlyLinkedList.insert(20);
        singlyLinkedList.insert(30);
        singlyLinkedList.insert(40);
        singlyLinkedList.insert(50);
        CreateAndDetectLoop.createLoop(singlyLinkedList.getHead(), 2);
        Assertions.assertEquals(true, CreateAndDetectLoop.detectLoop(singlyLinkedList.getHead()));
    }
    
    @Test
    public void detectUnExistingLoopWithElements() {
        CreateAndDetectLoop.createLoop(singlyLinkedList.getHead(), 0);
        Assertions.assertEquals(false, CreateAndDetectLoop.detectLoop(singlyLinkedList.getHead()));
    }
    
    @Test
    public void printElements() {
        singlyLinkedList.insert(10);
        singlyLinkedList.insert(20);
        singlyLinkedList.insert(30);
        singlyLinkedList.insert(40);
        singlyLinkedList.insert(50);
        Assertions.assertEquals("10 20 30 40 50 ", CreateAndDetectLoop.printList(singlyLinkedList.getHead()));
    }
}
