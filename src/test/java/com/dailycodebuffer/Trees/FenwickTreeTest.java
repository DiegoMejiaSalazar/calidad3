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
    public void queryAndUpdateTest(){
        fenwickTree.update(1,3);
        Assertions.assertNotNull(fenwickTree.query(1));
    }
}
