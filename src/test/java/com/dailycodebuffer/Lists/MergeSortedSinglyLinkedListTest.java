/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.Lists;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class MergeSortedSinglyLinkedListTest {
    
    private SinglyLinkedList listA;
    private SinglyLinkedList listB;
    
    @BeforeEach
    void init() {
        listA = new SinglyLinkedList();
        listB = new SinglyLinkedList();
        listA.insert(10);
        listA.insert(20);
        listA.insert(30);
        listA.insert(40);
        listA.insert(50);
        listB.insert(15);
        listB.insert(25);
        listB.insert(35);
        listB.insert(45);
        listB.insert(55);
    }
    
    @Test
    public void mergeListAWithListB() {
        SinglyLinkedList result = MergeSortedSinglyLinkedList.merge(listA, listB);
        Assertions.assertEquals("10->15->20->25->30->35->40->45->50->55", result.toString());
    }
    
    @Test
    public void mergeListBWithListA() {
        SinglyLinkedList result = MergeSortedSinglyLinkedList.merge(listB, listA);
        Assertions.assertEquals("10->15->20->25->30->35->40->45->50->55", result.toString());
    }
    
}
