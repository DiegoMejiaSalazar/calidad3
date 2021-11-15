package com.dailycodebuffer.Trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SegmentTreeTest {

    private SegmentTree segmentTree;

    @BeforeEach
    void init() {
        int arr[]={1,2,3,4,5};
        segmentTree = new SegmentTree(5,arr);
    }
    @Test
    public void SegmentTreeTest(){
        int arr1[]={};
        segmentTree.update(1,10);
        segmentTree.update(7,70);
        Assertions.assertEquals(0,segmentTree.getSum(-1,5));
        Assertions.assertEquals(12,segmentTree.getSum(2,4));
    }

}
