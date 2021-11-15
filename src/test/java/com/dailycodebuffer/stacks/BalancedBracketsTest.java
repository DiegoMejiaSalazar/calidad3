package com.dailycodebuffer.stacks;

import com.dailycodebuffer.Stacks.BalancedBrackets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class BalancedBracketsTest {

    @Test
    public void testBalancedBracket() {
        Assertions.assertTrue(BalancedBrackets.isBalanced("[()]{}{[()()]()}"));
    }

    @Test
    public void testUnBalancedBracket() {
        Assertions.assertFalse(BalancedBrackets.isBalanced("[(])"));
        Assertions.assertFalse(BalancedBrackets.isBalanced("[(])["));
        Assertions.assertFalse(BalancedBrackets.isBalanced("}}}}}"));
    }

    @Test
    public void testEmptyBrackets() {
        Assertions.assertTrue(BalancedBrackets.isBalanced(""));
    }

    @Test
    public void testNullBrackets() {
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () -> BalancedBrackets.isBalanced(null));
        Assertions.assertEquals("brackets is null", ex.getMessage());
    }

    @Test
    public void testWithInvalidCharacters() {
        Assertions.assertFalse(BalancedBrackets.isBalanced("x"));
    }
}
