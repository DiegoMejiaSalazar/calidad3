package com.dailycodebuffer.Trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AVLTreeTest {

    private AVLTree avl;

    @BeforeEach
    void init() {
        avl = new AVLTree();
    }

    @Test
    public void insertTest(){
        avl.insert(1);
        avl.insert(2);
        avl.insert(3);
        avl.insert(4);
        avl.insert(5);
        Assertions.assertFalse(avl.insert(1));
    }

    @Test
    public void searchTest(){
        avl.insert(1);
        Assertions.assertNotNull(avl.search(1));
    }
}
