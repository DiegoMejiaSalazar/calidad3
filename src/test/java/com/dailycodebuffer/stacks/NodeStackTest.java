/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.stacks;

import com.dailycodebuffer.Stacks.NodeStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author User
 */
public class NodeStackTest {

    @Test
    public void testStack() {
        NodeStack<Integer> Stack = new NodeStack<Integer>();

        Stack.push(3);
        Stack.push(4);
        Stack.push(5);
        Stack.print();

        Integer x = Stack.pop();
        Stack.push(1);
        Stack.push(8);
        Integer y = Stack.peek();
        Stack.print(); 
        Assertions.assertEquals(4, Stack.size());
        Assertions.assertNotNull(Stack.getHead());

    }
}
