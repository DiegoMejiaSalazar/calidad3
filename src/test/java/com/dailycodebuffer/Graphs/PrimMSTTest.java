/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.Graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author User
 */
public class PrimMSTTest {

    @Test
    public void primMst() {
        PrimMST t = new PrimMST();
        int graph[][]
                = new int[][]{
                    {0, 2, 0, 6, 0}, {2, 0, 3, 8, 5}, {0, 3, 0, 0, 7}, {6, 8, 0, 0, 9}, {0, 5, 7, 9, 0},};
        t.primMST(graph);
        int keys[] = {0, 2, 0, 6, 0};
        Boolean mstSet[] = {true, true, true, true, true};
        int result = t.minKey(keys, mstSet);
        Assertions.assertEquals(-1, result);
    }

}
