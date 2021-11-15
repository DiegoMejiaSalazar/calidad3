/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.stacks;

import static com.dailycodebuffer.Stacks.MaximumMinimumWindow.calculateMaxOfMin;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Mejia Salazar
 */
public class MaximumMinimumWindowTest {

    @Test
    public void calculateMaxMin() {
        int[] arr = new int[]{10, 20, 30, 50, 10, 70, 30};
        int[] target = {0, 70, 30, 20, 10, 10, 10};
        int[] res = calculateMaxOfMin(arr, arr.length - 1);
        Assertions.assertArrayEquals(res, target);
    }

}
