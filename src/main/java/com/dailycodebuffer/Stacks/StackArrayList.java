package com.dailycodebuffer.Stacks;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * This class implements a Stack using an ArrayList.
 *
 * <p>A stack is exactly what it sounds like. An element gets added to the top of the stack and only
 * the element on the top may be removed.
 *
 * <p>This is an ArrayList Implementation of a stack, where size is not a problem we can extend the
 * stack as much as we want.
 */
public class StackArrayList {

  /** ArrayList representation of the stack */
  private ArrayList<Integer> stack;

  /** Constructor */
  public StackArrayList() {
    stack = new ArrayList<>();
  }

  /**
   * Adds value to the end of list which is the top for stack
   *
   * @param value value to be added
   */
  public void push(int value) {
    stack.add(value);
  }

  /**
   * Removes the element at the top of this stack and returns
   *
   * @return Element popped
   * @throws EmptyStackException if the stack is empty.
   */
  public int pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }

    /* remove the element on the top of the stack */
    return stack.remove(stack.size() - 1);
  }

  /**
   * Test if the stack is empty.
   *
   * @return {@code true} if this stack is empty, {@code false} otherwise.
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  /**
   * Return the element at the top of this stack without removing it from the stack.
   *
   * @return the element at the top of this stack.
   */
  public int peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return stack.get(stack.size() - 1);
  }

  /**
   * Return size of this stack.
   *
   * @return size of this stack.
   */
  public int size() {
    return stack.size();
  }
}
