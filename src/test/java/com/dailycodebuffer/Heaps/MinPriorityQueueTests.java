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

    }

}
