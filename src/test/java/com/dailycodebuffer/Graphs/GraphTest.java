/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.Graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author User
 */
public class GraphTest {
    
    private AdjacencyListGraph<Integer> graph;
    
    @BeforeEach
    void init() {
        graph = new AdjacencyListGraph<>();
    }

    @Test
    public void addEdges() {
        Assertions.assertTrue(graph.addEdge(1, 2));
        Assertions.assertTrue(graph.addEdge(1, 5));
        Assertions.assertTrue(graph.addEdge(2, 5));
        Assertions.assertFalse(graph.addEdge(1, 2));
        Assertions.assertTrue(graph.addEdge(2, 3));
        Assertions.assertTrue(graph.addEdge(3, 4));
        Assertions.assertTrue(graph.addEdge(4, 1));
        Assertions.assertFalse(graph.addEdge(2, 3));
        System.out.println(graph);
    }
    
    @Test
    public void removeEdges() {
        Assertions.assertTrue(graph.addEdge(1, 2));
        Assertions.assertTrue(graph.addEdge(1, 5));
        Assertions.assertTrue(graph.addEdge(2, 5));
        Assertions.assertTrue(graph.addEdge(2, 3));
        Assertions.assertTrue(graph.addEdge(3, 4));
        Assertions.assertTrue(graph.addEdge(4, 1));
        Assertions.assertTrue(graph.removeEdge(1, 2));
        Assertions.assertFalse(graph.removeEdge(7, 3));
        System.out.println(graph);
    }
    
    @Test
    public void removeAdjacentVertex() {
        graph.addEdge(4, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 5);
        graph.addEdge(2, 5);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        Assertions.assertFalse(graph.removeEdge(4, 9));
        Assertions.assertFalse(graph.addEdge(1, 2));
    }
    
}
