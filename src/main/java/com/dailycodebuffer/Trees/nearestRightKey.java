package com.dailycodebuffer.Trees;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class NRKTree {

    public NRKTree left;
    public NRKTree right;
    public int data;

    public NRKTree(int x) {
        this.left = null;
        this.right = null;
        this.data = x;
    }

    public NRKTree(NRKTree right, NRKTree left, int x) {
        this.left = left;
        this.right = right;
        this.data = x;
    }

    public NRKTree insertKey(NRKTree current, int value) {
        if (current == null) {
            return new NRKTree(value);
        }

        if (value < current.data) {
            current.left = insertKey(current.left, value);
        } else if (value > current.data) {
            current.right = insertKey(current.right, value);
        }

        return current;
    }
}
