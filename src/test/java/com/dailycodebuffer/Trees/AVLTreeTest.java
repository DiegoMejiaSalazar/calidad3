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
    public void insertTest() {
        avl.insert(1);
        avl.insert(2);
        avl.insert(3);
        avl.insert(4);
        avl.insert(5);
        Assertions.assertFalse(avl.insert(1));
    }

    @Test
    public void removeElement() {
        avl.insert(10);
        avl.insert(2);
        avl.insert(9);
        avl.insert(8);
        avl.insert(12);
        avl.insert(39);
        avl.insert(93);
        avl.insert(33);
        avl.insert(55);
        avl.insert(89);
        avl.insert(77);
        avl.insert(69);
        avl.insert(0);
        avl.insert(25);
        avl.printBalance();
        avl.delete(0);
        avl.delete(33);
        avl.delete(89);
        Assertions.assertFalse(avl.search(0));
        Assertions.assertFalse(avl.search(33));
        Assertions.assertFalse(avl.search(89));
    }

    @Test
    public void removeFromEmptyTree() {
        avl.delete(10);
        Assertions.assertFalse(avl.search(0));
        Assertions.assertFalse(avl.search(33));
        Assertions.assertFalse(avl.search(89));
    }

    @Test
    public void searchTest() {
        avl.insert(1);
        Assertions.assertNotNull(avl.search(1));
    }
}
