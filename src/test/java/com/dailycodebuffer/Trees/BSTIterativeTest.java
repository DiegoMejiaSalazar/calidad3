package com.dailycodebuffer.Trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BSTIterativeTest {

    private BSTIterative bstIterative;
    @BeforeEach
    void init() {
        bstIterative = new BSTIterative();
    }

    @Test
    public void addTest(){
        bstIterative.add(5);
        bstIterative.add(6);
        bstIterative.add(8);
        bstIterative.add(8);
        Assertions.assertTrue(bstIterative.find(8));
        Assertions.assertTrue(bstIterative.find(5));
    }

    @Test
    public void findTest() {
        bstIterative.add(5);
        bstIterative.add(6);
        bstIterative.add(8);
        Assertions.assertTrue(bstIterative.find(5));
        Assertions.assertFalse(bstIterative.find(9));
    }

    @Test
    public void removeTest(){
        bstIterative.add(5);
        bstIterative.add(6);
        bstIterative.add(2);
        bstIterative.add(3);
        bstIterative.add(8);
        bstIterative.add(10);
        bstIterative.add(9);
        bstIterative.add(4);
        bstIterative.add(1);
        bstIterative.remove(8);
        bstIterative.remove(2);
        bstIterative.remove(10);
        bstIterative.remove(5);
        Assertions.assertFalse(bstIterative.find(8));
        Assertions.assertFalse(bstIterative.find(2));
        Assertions.assertFalse(bstIterative.find(10));
        Assertions.assertFalse(bstIterative.find(5));

    }

    @Test
    public void preOrderWithThreeDataTest(){
        bstIterative.add(5);
        bstIterative.add(6);
        bstIterative.add(8);
        Assertions.assertTrue(bstIterative.find(6));
        bstIterative.preorder();
        Assertions.assertTrue(bstIterative.find(5));

    }
    @Test
    public void preOrderWithoutDataTest(){
        bstIterative.preorder();
        Assertions.assertFalse(bstIterative.find(10));
    }

    @Test
    public void postOrderTest() {
        bstIterative.add(5);
        bstIterative.add(6);
        bstIterative.add(8);
        Assertions.assertTrue(bstIterative.find(8));
        bstIterative.postorder();
        bstIterative.remove(5);
        bstIterative.remove(6);
        bstIterative.remove(8);
        bstIterative.postorder();
        Assertions.assertFalse(bstIterative.find(8));

    }

    @Test
    public void inOrderTest() {
        bstIterative.add(5);
        bstIterative.add(6);
        bstIterative.add(8);
        Assertions.assertTrue(bstIterative.find(5));
        bstIterative.inorder();
        bstIterative.remove(5);
        bstIterative.remove(6);
        bstIterative.remove(8);
        bstIterative.inorder();
        Assertions.assertFalse(bstIterative.find(5));

    }

}
