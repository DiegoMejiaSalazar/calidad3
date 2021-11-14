/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.Lists;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class RemoveDuplicateNodesTest {
    
    @Test
    public void removeDuplicatedNodes() {
        RemoveDuplicateNodes instance = new RemoveDuplicateNodes();
        Node head = new Node(0, new Node(2, new Node(3, new Node(3, new Node(4)))));
        head = instance.deleteDuplicates(head);
        instance.print(head);
        List<Integer> elements = List.of(0,2,4);
        Node current = head;
        while(current != null) {
            Assertions.assertTrue(elements.contains(current.value));
            current = current.next;
        }
    }
    
     @Test
    public void removeDuplicatedNodes1() {
        RemoveDuplicateNodes instance = new RemoveDuplicateNodes();
        Node head = new Node(0, new Node(2, new Node(3, new Node(2, new Node(4)))));
        head = instance.deleteDuplicates(head);
        instance.print(head);
        List<Integer> elements = List.of(0,2,3,4);
        Node current = head;
        while(current != null) {
            Assertions.assertTrue(elements.contains(current.value));
            current = current.next;
        }
    }
    
    @Test
    public void printEmptyNode() {
        RemoveDuplicateNodes instance = new RemoveDuplicateNodes();
        Node head = null;
        instance.print(head);
        Assertions.assertNull(instance.deleteDuplicates(head));
    }
}
