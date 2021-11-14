package com.dailycodebuffer.Trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FenwickTreeTest {

    private FenwickTree fenwickTree;
    @BeforeEach
    void init() {
        fenwickTree = new FenwickTree(5);
    }

    @Test
    public void updateTest(){

        fenwickTree.update(1,3);
        fenwickTree.update(5,3);
    }
    @Test
    public void queryTest(){
        Assertions.assertNotNull(fenwickTree.query(1));
    }
}
