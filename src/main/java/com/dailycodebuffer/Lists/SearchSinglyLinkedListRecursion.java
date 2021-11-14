package com.dailycodebuffer.Lists;

public class SearchSinglyLinkedListRecursion extends SinglyLinkedList {
  /**
   * Test if the value key is present in the list using recursion.
   *
   * @param node the head node.
   * @param key the value to be searched.
   * @return {@code true} if key is present in the list, otherwise {@code false}.
   */
  private boolean searchRecursion(Node node, int key) {
    return node != null && (node.value == key || searchRecursion(node.next, key));
  }

  @Override
  public boolean search(int key) {
    return searchRecursion(getHead(), key);
  }
}
