/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.Lists;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class MergeSortedArrayListTest {
    
    private List<Integer> listA;
    private List<Integer> listB;
    private List<Integer> listC;
    
    @BeforeEach
    void init() {
        listA = new ArrayList<>();
        listB = new ArrayList<>();
        listC = new ArrayList<>();
    }
    
    @Test
    public void testMergeListAandBWhereBHasTheLowestValues() {
        listA.add(10);
        listA.add(20);
        listA.add(30);
        listA.add(40);
        listA.add(50);
        listB.add(0);
        listB.add(1);
        listB.add(2);
        listB.add(3);
        listB.add(4);
        MergeSortedArrayList.merge(listA, listB, listC);
        List<Integer> expected = List.of(0,1,2,3,4,10,20,30,40,50);
        Assertions.assertArrayEquals(expected.toArray(), listC.toArray());
    }
    
        @Test
    public void testMergeListAandBWhereAHasTheLowestValues() {
        listB.add(10);
        listB.add(20);
        listB.add(30);
        listB.add(40);
        listB.add(50);
        listA.add(0);
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        MergeSortedArrayList.merge(listA, listB, listC);
        List<Integer> expected = List.of(0,1,2,3,4,10,20,30,40,50);
        Assertions.assertArrayEquals(expected.toArray(), listC.toArray());
    }
}
