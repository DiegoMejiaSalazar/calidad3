package com.dailycodebuffer.Trees;

import com.dailycodebuffer.Lists.CreateAndDetectLoop;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    private BinaryTree binaryTree;
    @BeforeEach
    void init() {
        binaryTree = new BinaryTree();
    }

    @Test
    public void insertAndFindTest(){
        binaryTree.put(1);
        binaryTree.put(2);
        binaryTree.put(3);
        binaryTree.put(4);
        Assertions.assertNotNull(binaryTree.find(1));
        Assertions.assertNotNull(binaryTree.find(2));
        Assertions.assertNotNull(binaryTree.find(3));
        Assertions.assertNotNull(binaryTree.find(4));

        Assertions.assertNotNull(binaryTree.find(6));
    }

    @Test
    public void removeNoChildrenTest(){
        binaryTree.put(1);
        binaryTree.remove(1);
        Assertions.assertNull(binaryTree.find(1));
    }
    @Test
    public void removeValueDoesntAndDoesExist(){
        binaryTree.put(1);
        binaryTree.put(2);
        Assertions.assertFalse(binaryTree.remove(3));
        Assertions.assertTrue(binaryTree.remove(2));
    }
    @Test
    public void removeOneChild(){
        binaryTree.put(5);
        binaryTree.put(2);
        binaryTree.put(7);
        binaryTree.remove(7);
        Assertions.assertNull(binaryTree.find(5).right);
        Assertions.assertNotNull(binaryTree.find(5).left);
    }
    @Test
    public void removeTheFather(){
        binaryTree.put(5);
        binaryTree.put(2);
        binaryTree.put(7);
        binaryTree.remove(5);
        Assertions.assertEquals(binaryTree.find(7),binaryTree.find(2).parent);
    }
    @Test
    public void removeFatherWithLeftChild(){
        binaryTree.put(5);
        binaryTree.put(2);
        binaryTree.remove(5);
        Assertions.assertNull(binaryTree.find(2).left);
        Assertions.assertNull(binaryTree.find(2).right);
    }
    @Test
    public void removeAFatherButWithGrandchildren(){
        binaryTree.put(5);
        binaryTree.put(4);
        binaryTree.put(7);
        binaryTree.put(2);
        binaryTree.put(9);
        binaryTree.put(6);
        binaryTree.put(8);
        binaryTree.remove(5);
        Assertions.assertEquals(binaryTree.find(6).data,binaryTree.find(4).parent.data);
    }
    @Test
    public void removeAFatherButWithchildren(){
        binaryTree.put(5);
        binaryTree.put(4);
        binaryTree.put(7);
        binaryTree.put(2);
        binaryTree.put(9);
        binaryTree.put(6);
        binaryTree.put(8);
        binaryTree.remove(7);
        Assertions.assertEquals(binaryTree.find(6).data,binaryTree.find(8).left.data);
    }
    @Test
    public void bfsTest(){
        BinaryTree.Node node;
        binaryTree.bfs(node = new BinaryTree.Node(5));
        Assertions.assertNotNull(node.data);
        binaryTree.bfs(node = new BinaryTree.Node(2));
        Assertions.assertNotNull(node.data);
        binaryTree.bfs(node = new BinaryTree.Node(3));
        Assertions.assertNotNull(node.data);
        binaryTree.bfs(node = new BinaryTree.Node(1));
        Assertions.assertNotNull(node.data);
        Assertions.assertNull(node.parent);
    }
    @Test
    public void postOrderTest(){
        BinaryTree.Node node;
        binaryTree.postOrder(node = new BinaryTree.Node(5));
        Assertions.assertNotNull(node.data);
        binaryTree.postOrder(node = new BinaryTree.Node(50));
        Assertions.assertNotNull(node.data);
        binaryTree.postOrder(node = new BinaryTree.Node(1));
        Assertions.assertNotNull(node.data);
        binaryTree.postOrder(node = new BinaryTree.Node(2));
        Assertions.assertNotNull(node.data);
        Assertions.assertNull(node.left);

    }
    @Test
    public void preOrderTest(){
        BinaryTree.Node node;
        binaryTree.preOrder(node = new BinaryTree.Node(5));
        Assertions.assertNotNull(node.data);
        binaryTree.preOrder(node = new BinaryTree.Node(9));
        Assertions.assertNotNull(node.data);
        binaryTree.preOrder(node = new BinaryTree.Node(1));
        Assertions.assertNotNull(node.data);
        binaryTree.preOrder(node = new BinaryTree.Node(2));
        Assertions.assertNotNull(node.data);
        Assertions.assertNull(node.right);
    }
    @Test
    public void inOrderTest(){
        BinaryTree.Node node;
        binaryTree.inOrder(node = new BinaryTree.Node(5));
        Assertions.assertNotNull(node.data);
        binaryTree.inOrder(node = new BinaryTree.Node(1));
        Assertions.assertNotNull(node.data);
        binaryTree.inOrder(node = new BinaryTree.Node(8));
        Assertions.assertNotNull(node.data);
        binaryTree.inOrder(node = new BinaryTree.Node(2));
        Assertions.assertNotNull(node.data);
        Assertions.assertNull(node.parent);
    }
}
