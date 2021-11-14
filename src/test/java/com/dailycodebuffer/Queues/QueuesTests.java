/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailycodebuffer.Queues;

import com.dailycodebuffer.DynamicArray.DynamicArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Andy_
 */
public class QueuesTests {

    private Queue queue, queue1, queue2;
    private PriorityQueue pqueue, pqueue1;
    private circularQueue cqueue;
    private LinkedQueue lqueue;
    private GenericArrayListQueue<Integer> gqueue;

    @BeforeEach
    void init() {
        queue = new Queue();
        queue1 = new Queue(5);
        queue2 = new Queue(1);
        pqueue = new PriorityQueue(3);
        cqueue = new circularQueue(3);
        lqueue = new LinkedQueue();
        gqueue = new GenericArrayListQueue<>();
    }

    @Test
    public void insertQueue() {
        Assertions.assertTrue(queue1.insert(3));
        queue2.insert(2);
        queue2.insert(4);
        Assertions.assertFalse(queue2.insert(3));
    }

    @Test
    public void emptyfullQueue() {
        if (queue.isEmpty()) {
            Assertions.assertTrue(queue.getSize() == 0);
        }
    }

    @Test
    public void removeQueue() {
        Assertions.assertEquals(-1, queue.remove());
        queue2.insert(2);
        Assertions.assertEquals(2, queue2.remove());
    }

    @Test
    public void peekQueue() {
        queue2.insert(2);
        Assertions.assertEquals(2, queue2.peekFront());
        Assertions.assertEquals(2, queue2.peekRear());
    }

    @Test
    public void stringQueue() {
        queue2.insert(1);
        Assertions.assertEquals("[1]", queue2.toString());
    }

    @Test
    public void insertPriorityQueue() {
        pqueue.insert(3);
        Assertions.assertEquals(1, pqueue.getSize());
        pqueue.insert(2);
        pqueue.insert(1);
        Assertions.assertEquals(3, pqueue.getSize());
        //RuntimeException ex= new RuntimeException("Queue is full");
        //pqueue.insert(2);
        //Assertions.assertThrows(ex,pqueue.insert(2));
    }

    @Test
    public void emptyPriorityQueue() {
        Assertions.assertTrue(pqueue.isEmpty());
    }

    @Test
    public void removePriorityQueue() {
        pqueue.insert(3);
        pqueue.insert(2);
        pqueue.insert(1);
        Assertions.assertEquals(3, pqueue.remove());
    }

    @Test
    public void peekPriorityQueue() {
        pqueue.insert(3);
        pqueue.insert(2);
        pqueue.insert(1);
        Assertions.assertEquals(3, pqueue.peek());
    }
//    @Test
//    public void emptyCircularQueue(){
//    Assertions.assertTrue(cqueue.isEmpty());
//    cqueue.enQueue(3);
//    Assertions.assertFalse(cqueue.isEmpty());
//    }

    @Test
    public void emptyLinkedQueue() {
        Assertions.assertTrue(lqueue.isEmpty());
    }

    @Test
    public void enqueueLinked() {
        Assertions.assertTrue(lqueue.enqueue(5));
    }

    @Test
    public void dequeueLinked() {
        lqueue.enqueue(6);
        lqueue.enqueue(7);
        Assertions.assertEquals(6, lqueue.dequeue());
        lqueue.dequeue();
    }

    @Test
    public void peekLinkedQueue() {
        lqueue.enqueue(6);
        lqueue.enqueue(7);
        Assertions.assertEquals(6, lqueue.peekFront());
        Assertions.assertEquals(7, lqueue.peekRear());
        lqueue.dequeue();
        lqueue.dequeue();
        //Assertions.assertEquals(7,lqueue.peekFront());
        //Assertions.assertEquals(7,lqueue.peekRear());
    }

    @Test
    public void sizeLinkedQueue() {
        lqueue.enqueue(6);
        Assertions.assertEquals(1, lqueue.size());
    }

    @Test
    public void clearLinkedQueue() {
        lqueue.enqueue(6);
        lqueue.enqueue(7);
        lqueue.clear();
        Assertions.assertEquals(0, lqueue.size());
    }

    @Test
    public void toStringLinkedQueue() {
        Assertions.assertEquals("[]", lqueue.toString());
        lqueue.enqueue(6);
        lqueue.enqueue(7);
        Assertions.assertEquals("[6, 7]", lqueue.toString());
    }

    @Test
    public void peekGenericQueue() {
        gqueue.add(5);
        Assertions.assertEquals(5, gqueue.peek());
    }

    @Test
    public void pullGenericQueue() {
        gqueue.add(5);
        gqueue.add(6);
        Assertions.assertEquals(5, gqueue.pull());
    }

    @Test
    public void CircularQueuelements() {
        cqueue.enQueue(1);
        cqueue.enQueue(2);
        cqueue.enQueue(3);
        Assertions.assertEquals(1,cqueue.deQueue());
    }
}
