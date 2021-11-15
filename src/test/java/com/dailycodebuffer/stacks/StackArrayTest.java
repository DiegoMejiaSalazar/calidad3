/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.stacks;

import com.dailycodebuffer.Stacks.StackArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Mejia
 */
public class StackArrayTest {

    @Test
    public void testStackArray() {
        StackArray myStackArray = new StackArray(4);
        Assertions.assertTrue(myStackArray.isEmpty());
        Assertions.assertFalse(myStackArray.isFull());

        myStackArray.push(5);
        myStackArray.push(8);
        myStackArray.push(2);
        myStackArray.push(9);

        Assertions.assertFalse(myStackArray.isEmpty());
        Assertions.assertTrue(myStackArray.isFull());
        Assertions.assertEquals(9, myStackArray.peek());
        Assertions.assertEquals(9, myStackArray.pop());
        Assertions.assertEquals(2, myStackArray.peek());
        Assertions.assertEquals(3, myStackArray.size());
        myStackArray.push(10);
        myStackArray.push(11);
        Assertions.assertEquals(5, myStackArray.size());
    }

    @Test
    public void testPopAndPeekFromEmptyStack() {
        StackArray myStackArray = new StackArray(2);
        Assertions.assertTrue(myStackArray.isEmpty());
        Assertions.assertEquals(-1, myStackArray.peek());
        myStackArray.push(5);
        myStackArray.push(8);
        myStackArray.pop();
        myStackArray.pop();
    }

    @Test
    public void testPopFromDefaultConstructor() {
        StackArray stack = new StackArray();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> stack.pop());
        stack.push(10);
        stack.pop();
        stack.makeEmpty();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> stack.pop());
    }
}
