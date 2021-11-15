package com.dailycodebuffer.Trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class nearestRightKeyTest {

    private NRKTree nrkTree;
    private NRKTree nrkTree1;
    @BeforeEach
    void init() {
        NRKTree right,left;
        nrkTree = new NRKTree(5);
        nrkTree1 = new NRKTree(right = new NRKTree(10),left = new NRKTree(2),5);

    }

    @Test
    public void insertKeys(){
        NRKTree current = new NRKTree(1);
        nrkTree.insertKey(current,10);
        Assertions.assertEquals(1,current.data);
    }
}
