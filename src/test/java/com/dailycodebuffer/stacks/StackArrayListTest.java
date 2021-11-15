package com.dailycodebuffer.stacks;

import com.dailycodebuffer.Stacks.StackArrayList;
import java.util.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class StackArrayListTest {

    @Test
    public void addElementsToStackArrayList() {
        StackArrayList stack = new StackArrayList();
        Assertions.assertTrue(stack.isEmpty());

        for (int i = 1; i <= 5; ++i) {
            stack.push(i);
        }

        Assertions.assertEquals(5, stack.size());
        Assertions.assertEquals(5, stack.peek());
        Assertions.assertEquals(5, stack.pop());
        Assertions.assertEquals(4, stack.peek());
        while (!stack.isEmpty()) {
            stack.pop();
        }
        Assertions.assertThrows(EmptyStackException.class, () -> stack.peek());
        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertThrows(EmptyStackException.class, () -> stack.pop());
    }
}
