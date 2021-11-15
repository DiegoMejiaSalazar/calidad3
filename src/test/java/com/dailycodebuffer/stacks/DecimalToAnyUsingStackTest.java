/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.stacks;

import org.junit.jupiter.api.Test;
import com.dailycodebuffer.Stacks.DecimalToAnyUsingStack;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author User
 */
public class DecimalToAnyUsingStackTest {

    @Test
    public void convertElements() {
        Assertions.assertEquals("0", DecimalToAnyUsingStack.convert(0, 2));
        Assertions.assertEquals("11110", DecimalToAnyUsingStack.convert(30, 2));
        Assertions.assertEquals("36", DecimalToAnyUsingStack.convert(30, 8));
        Assertions.assertEquals("30", DecimalToAnyUsingStack.convert(30, 10));
        Assertions.assertEquals("1E", DecimalToAnyUsingStack.convert(30, 16));
    }

}
