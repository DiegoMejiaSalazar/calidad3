package com.dailycodebuffer.Graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Orlando Mejia Salazar
 */
public class KahnsAlgorithmSortTest {
    
    @Test
    public void topologicalSort() {
        AdjacencyList<String> graph = new AdjacencyList<>();
        graph.addEdge("a","b");
        graph.addEdge("c","a");
        graph.addEdge("a","d");
        graph.addEdge("b","d");
        graph.addEdge("c","u");
        graph.addEdge("u","b");
        
        TopologicalSort<String> topSort = new TopologicalSort<>(graph);
        String[] result = topSort.topSortOrder().stream().toArray(String[]::new);
        List<String> expected = List.of("c", "a", "u", "b", "d");
        
        for(String x: result) {
            Assertions.assertTrue(expected.contains(x));
        }
    }
}
