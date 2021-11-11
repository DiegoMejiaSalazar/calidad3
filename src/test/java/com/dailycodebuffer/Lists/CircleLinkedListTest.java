package com.dailycodebuffer.Lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class CircleLinkedListTest {
    
    private CircleLinkedList circleLinkedList;
    
    @BeforeEach
    void init() {
        circleLinkedList = new CircleLinkedList<String>();
    }
    
    @Test
    public void addFiveElements() {
        circleLinkedList.append("Diego");
        circleLinkedList.append("Obama");
        circleLinkedList.append("Fabio");
        Assertions.assertEquals(3, circleLinkedList.getSize());
        Assertions.assertEquals("[ Diego , Obama , Fabio ,  ]", circleLinkedList.toString());
    }
    
    @Test
    public void removeExistingElement() {
        circleLinkedList.append("Diego");
        circleLinkedList.append("Pepe");
        circleLinkedList.append("Moises");
        Assertions.assertEquals(3, circleLinkedList.getSize());
        circleLinkedList.remove(1);
        Assertions.assertEquals(2, circleLinkedList.getSize());
        Assertions.assertEquals("[ Diego , Moises ,  ]", circleLinkedList.toString());
    }
    
    @Test
    public void removeUnExistingElement() {
        circleLinkedList.append("Diego");
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> circleLinkedList.remove(2));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> circleLinkedList.remove(-1));
        Assertions.assertEquals(1, circleLinkedList.getSize());
        Assertions.assertEquals("[ Diego ,  ]", circleLinkedList.toString());
    }
    
    @Test
    public void addNullElement() {
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> circleLinkedList.append(null));
        Assertions.assertEquals("Cannot add null element to the list", exception.getMessage());
    }
}
