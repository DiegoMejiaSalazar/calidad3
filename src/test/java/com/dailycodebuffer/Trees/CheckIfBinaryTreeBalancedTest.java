package com.dailycodebuffer.Trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckIfBinaryTreeBalancedTest {

    private CheckIfBinaryTreeBalanced checkIfBinaryTreeBalanced;
    @BeforeEach
    void init() {
        checkIfBinaryTreeBalanced = new CheckIfBinaryTreeBalanced();
    }

    @Test
    public void binaryTreeBalancedTest(){
        checkIfBinaryTreeBalanced.isBalancedRecursive(checkIfBinaryTreeBalanced.buildBalancedTree());
        checkIfBinaryTreeBalanced.isBalancedIterative(checkIfBinaryTreeBalanced.buildBalancedTree());
        Assertions.assertNotNull(checkIfBinaryTreeBalanced.buildBalancedTree());
        Assertions.assertNotNull(checkIfBinaryTreeBalanced.buildUnbalancedTree());
    }
}
