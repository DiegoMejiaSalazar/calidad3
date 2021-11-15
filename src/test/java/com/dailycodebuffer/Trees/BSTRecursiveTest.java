package com.dailycodebuffer.Trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BSTRecursiveTest {
    private BSTRecursive bstRecursive;

    @BeforeEach
    void init() {
        bstRecursive = new BSTRecursive();
    }

    @Test
    public void BSTRecursiveTest() {
        bstRecursive.add(2);
        bstRecursive.add(21);
        bstRecursive.add(4);
        bstRecursive.add(5);
        bstRecursive.inorder();
        bstRecursive.postorder();
        bstRecursive.preorder();
        bstRecursive.remove(21);
        bstRecursive.remove(50);
        Assertions.assertTrue(bstRecursive.find(2));
        Assertions.assertFalse(bstRecursive.find(21));
    }
    @Test
    public void removeAll(){
        bstRecursive.add(2);
        bstRecursive.add(21);
        bstRecursive.add(4);
        bstRecursive.add(5);
        bstRecursive.remove(2);
        bstRecursive.remove(21);
        bstRecursive.remove(4);
        bstRecursive.remove(5);
        bstRecursive.inorder();
        bstRecursive.postorder();
        bstRecursive.preorder();
        Assertions.assertFalse(bstRecursive.find(10));
    }
}
