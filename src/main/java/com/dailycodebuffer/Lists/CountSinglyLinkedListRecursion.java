package com.dailycodebuffer.Lists;

public class CountSinglyLinkedListRecursion extends SinglyLinkedList {
  /**
   * Calculate the count of the list manually using recursion.
   *
   * @param head head of the list.
   * @return count of the list.
   */
  private int countRecursion(Node head) {
    return head == null ? 0 : 1 + countRecursion(head.next);
  }
  /** Returns the count of the list. */
  @Override
  public int count() {
    return countRecursion(getHead());
  }
}
