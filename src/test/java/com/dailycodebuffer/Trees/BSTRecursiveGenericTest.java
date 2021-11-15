package com.dailycodebuffer.Trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BSTRecursiveGenericTest {

    private BSTRecursiveGeneric bstRecursiveGeneric;

    @BeforeEach
    void init() {
        bstRecursiveGeneric = new BSTRecursiveGeneric();
    }

    @Test
    public void BSTRecursiveTest(){
        bstRecursiveGeneric.add(2);
        bstRecursiveGeneric.add(21);
        bstRecursiveGeneric.add(4);
        bstRecursiveGeneric.add(5);
        bstRecursiveGeneric.inorder();
        bstRecursiveGeneric.postorder();
        bstRecursiveGeneric.preorder();
        bstRecursiveGeneric.inorderSort();
        bstRecursiveGeneric.remove(2);
        bstRecursiveGeneric.remove(15);
        Assertions.assertFalse(bstRecursiveGeneric.find(2));
        Assertions.assertTrue(bstRecursiveGeneric.find(21));
    }
    @Test
    public void removeAll(){
        bstRecursiveGeneric.add(2);
        bstRecursiveGeneric.add(21);
        bstRecursiveGeneric.add(4);
        bstRecursiveGeneric.add(5);
        bstRecursiveGeneric.remove(2);
        bstRecursiveGeneric.remove(21);
        bstRecursiveGeneric.remove(4);
        bstRecursiveGeneric.remove(5);
        bstRecursiveGeneric.inorder();
        bstRecursiveGeneric.postorder();
        bstRecursiveGeneric.preorder();
        bstRecursiveGeneric.inorderSort();
        Assertions.assertFalse(bstRecursiveGeneric.find(10));
    }
}
