package com.dailycodebuffer.Lists;

public class MergeSortedSinglyLinkedList extends SinglyLinkedList {
    
  /**
   * Merge two sorted SingleLinkedList
   *
   * @param listA the first sorted list
   * @param listB the second sored list
   * @return merged sorted list
   */
  public static SinglyLinkedList merge(SinglyLinkedList listA, SinglyLinkedList listB) {
    Node headA = listA.getHead();
    Node headB = listB.getHead();

    int size = listA.size() + listB.size();

    Node head = new Node();
    Node tail = head;
    while (headA != null && headB != null) {
      if (headA.value <= headB.value) {
        tail.next = headA;
        headA = headA.next;
      } else {
        tail.next = headB;
        headB = headB.next;
      }
      tail = tail.next;
    }
    if (headA == null) {
      tail.next = headB;
    }
    if (headB == null) {
      tail.next = headA;
    }
    return new SinglyLinkedList(head.next, size);
  }
}
