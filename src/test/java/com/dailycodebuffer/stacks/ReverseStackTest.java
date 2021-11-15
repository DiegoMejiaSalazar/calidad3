/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.stacks;

import java.util.Scanner;
import java.util.Stack;
import com.dailycodebuffer.Stacks.ReverseStack;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Diego Mejia
 */
public class ReverseStackTest {

    @Test
    public void reverseStackTest() {
        int n = 10;
        int i;
        Stack<Integer> stack = new Stack<Integer>();
        for(i = 0; i < n ; i++)
            stack.push(5 + i);
        ReverseStack.reverseStack(stack);
        List<Integer> result = List.of(5,6,7,8,9,10,11,12,13,14);
        Assertions.assertFalse(stack.isEmpty());
        while(!stack.isEmpty()){
            Assertions.assertTrue(result.contains(stack.pop()));
        }
    }
}
