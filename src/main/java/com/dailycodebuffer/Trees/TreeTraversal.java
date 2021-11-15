package com.dailycodebuffer.Trees;

import java.util.LinkedList;

/** @author Varun Upadhyay (https://github.com/varunu28) */

/**
 * The Node class which initializes a Node of a tree Consists of all 4 traversal methods:
 * printInOrder, printPostOrder， printPreOrder & printLevelOrder printInOrder: LEFT -> ROOT -> RIGHT
 * printPreOrder: ROOT -> LEFT -> RIGHT printPostOrder: LEFT -> RIGHT -> ROOT printLevelOrder:
 * Prints by level (starting at root), from left to right.
 */
class Node {
  Node left, right;
  int data;

  public Node(int data) {
    this.data = data;
  }

  public void insert(int value) {
    if (value < data) {
      if (left == null) {
        left = new Node(value);
      } else {
        left.insert(value);
      }
    } else {
      if (right == null) {
        right = new Node(value);
      } else {
        right.insert(value);
      }
    }
  }

  public void printInOrder() {
    if (left != null) {
      left.printInOrder();
    }
    System.out.print(data + " ");
    if (right != null) {
      right.printInOrder();
    }
  }

  public void printPreOrder() {
    System.out.print(data + " ");
    if (left != null) {
      left.printPreOrder();
    }
    if (right != null) {
      right.printPreOrder();
    }
  }

  public void printPostOrder() {
    if (left != null) {
      left.printPostOrder();
    }
    if (right != null) {
      right.printPostOrder();
    }
    System.out.print(data + " ");
  }

  /** O(n) time algorithm. Uses O(n) space to store nodes in a queue to aid in traversal. */
  public void printLevelOrder() {
    LinkedList<Node> queue = new LinkedList<>();
    queue.add(this);
    while (queue.size() > 0) {
      Node head = queue.remove();
      System.out.print(head.data + " ");
      // Add children of recently-printed node to queue, if they exist.
      if (head.left != null) {
        queue.add(head.left);
      }
      if (head.right != null) {
        queue.add(head.right);
      }
    }
  }
}
