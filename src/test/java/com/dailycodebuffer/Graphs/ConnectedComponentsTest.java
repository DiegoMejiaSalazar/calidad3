/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.client.ExpectedCount;

/**
 *
 * @author User
 */
public class ConnectedComponentsTest {

    @Test
    public void connectElement() {
        Graph<Character> graphChars = new Graph<>();
        graphChars.addEdge('a', 'b');
        graphChars.addEdge('a', 'e');
        graphChars.addEdge('b', 'e');
        graphChars.addEdge('b', 'c');
        graphChars.addEdge('c', 'd');
        graphChars.addEdge('d', 'a');
        graphChars.addEdge('x', 'y');
        graphChars.addEdge('x', 'z');
        graphChars.addEdge('w', 'w');
        Assertions.assertEquals(3, graphChars.countGraphs());
        Assertions.assertEquals(5, graphChars.depthFirstSearch(graphChars.edgeList.get(0).startNode, new ArrayList<>()).size());
    }

    @Test
    public void connectGraphOfNumbers() {
        Graph<Integer> graphInts = new Graph<>();
        graphInts.addEdge(1, 2);
        graphInts.addEdge(2, 3);
        graphInts.addEdge(2, 4);
        graphInts.addEdge(3, 5);
        graphInts.addEdge(7, 8);
        graphInts.addEdge(8, 10);
        graphInts.addEdge(10, 8);
        Assertions.assertEquals(2, graphInts.countGraphs());
        Assertions.assertEquals(5, graphInts.depthFirstSearch(graphInts.edgeList.get(0).startNode, new ArrayList<>()).size());
    }
}
