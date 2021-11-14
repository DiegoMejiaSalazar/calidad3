
package com.dailycodebuffer.Lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class SearchSinglyLinkedListRecurtionTest {
    
    @Test
    public void searchElement() {
    SearchSinglyLinkedListRecursion list = new SearchSinglyLinkedListRecursion();
        for (int i = 1; i <= 10; ++i) {
          list.insert(i);
        }

        for (int i = 1; i <= 10; ++i) {
          Assertions.assertTrue(list.search(i));
        }
        Assertions.assertFalse(list.search(-1));
        Assertions.assertFalse(list.search(100));
    }
}
