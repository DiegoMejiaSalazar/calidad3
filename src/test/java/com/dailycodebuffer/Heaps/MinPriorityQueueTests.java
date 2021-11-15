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
public class MinPriorityQueueTests {

    private MinPriorityQueue mpqueue;

    @BeforeEach
    void init() {
        mpqueue = new MinPriorityQueue(3);
    }

    @Test
    public void inserttMinPriorityQueue() {
        Assertions.assertTrue(mpqueue.isEmpty());
        mpqueue.insert(1);
        mpqueue.print();
        Assertions.assertFalse(mpqueue.isEmpty());
    }

    @Test
    public void peektMinPriorityQueue() {
        mpqueue.insert(1);
        Assertions.assertEquals(1, mpqueue.peek());
    }

    @Test
    public void deleteMinPriorityQueue() {
        mpqueue.delete();
        mpqueue.insert(1);
        Assertions.assertEquals(0, mpqueue.delete());
        mpqueue.insert(3);
        mpqueue.insert(1);
        mpqueue.insert(6);
        mpqueue.insert(2);
        mpqueue.insert(5);

        Assertions.assertEquals(1, mpqueue.delete());
        mpqueue.insert(10);
        mpqueue.insert(2);
        mpqueue.insert(8);
        mpqueue.insert(30);
        mpqueue.insert(9);
        mpqueue.insert(15);
        mpqueue.insert(19);
        mpqueue.insert(21);
        mpqueue.insert(22);
        mpqueue.insert(55);
        mpqueue.delete();
        mpqueue.delete();
        mpqueue.delete();
        mpqueue.delete();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,()->mpqueue.delete());
    }
    @Test
    public void heapSortTest(){
        mpqueue.insert(10);
        mpqueue.insert(2);
        mpqueue.insert(8);
        mpqueue.insert(30);
        mpqueue.insert(9);
        mpqueue.insert(15);
        mpqueue.insert(19);
        mpqueue.insert(21);
        mpqueue.insert(22);
        mpqueue.insert(55);
        mpqueue.insert(100);
        mpqueue.insert(25);
        mpqueue.insert(81);
        mpqueue.insert(36);
        mpqueue.insert(91);
        mpqueue.insert(100);
        mpqueue.insert(29);
        mpqueue.insert(28);
        mpqueue.insert(200);
        mpqueue.insert(105);
        Assertions.assertEquals(2, mpqueue.peek());
        mpqueue.heapSort();
        Assertions.assertFalse(mpqueue.isEmpty());
    }
}
