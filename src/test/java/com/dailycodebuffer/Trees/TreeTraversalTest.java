package com.dailycodebuffer.Trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeTraversalTest {
    private Node tree;

    @BeforeEach
    void init() {
        tree = new Node(5);
    }

    @Test
    public void treeTraversalTest(){
        tree.insert(3);
        tree.insert(2);
        Assertions.assertEquals(3,tree.left.data);
        Assertions.assertNull(tree.right);
        tree.insert(5);
        tree.insert(4);
        tree.insert(30);
        tree.insert(10);
        tree.printInOrder();
        tree.printPostOrder();
        tree.printLevelOrder();
        tree.printPreOrder();
    }
}
