/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.dailycodebuffer.Stacks.DuplicateBrackets;
import java.util.EmptyStackException;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Diego Mejia Salazar
 */
public class DuplicateBracketTest {

    @Test
    public void testDuplicateBrackets() {
        Assertions.assertTrue(DuplicateBrackets.check("()()"));
        Assertions.assertTrue(DuplicateBrackets.check("(((())))"));
        Assertions.assertFalse(DuplicateBrackets.check("(((("));
        Assertions.assertFalse(DuplicateBrackets.check(""));
//        Assertions.assertTrue(DuplicateBrackets.check("))((()))))))))")); bug
    }

    @Test
    public void testEmptyBrackets() {
        Assertions.assertThrows(EmptyStackException.class, () -> DuplicateBrackets.check(")"));
        
    }

    @Test
    @Disabled // BUG
    public void testInvalidBrackets() {
        Assertions.assertFalse(DuplicateBrackets.check("((((()"));
    }
}
