/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailycodebuffer.Graphs;
import org.junit.jupiter.api.Test;

/**
 *
 * @author User
 */
public class FloydWarshallTest {

    @Test
    public void generateGraphForFloydWarshall() {
        int numberOfVertices = 20;
        int[][] adjacencyMatrix = new int[numberOfVertices + 1][numberOfVertices + 1];
        System.out.println("Enter the Weighted Matrix for the graph");
        for (int source = 1; source <= numberOfVertices; source++) {
            for (int destination = 1; destination <= numberOfVertices; destination++) {
                adjacencyMatrix[source][destination] = 20;
                if (source == destination) {
                    adjacencyMatrix[source][destination] = 0;
                    continue;
                }
                if (adjacencyMatrix[source][destination] == 0) {
                    adjacencyMatrix[source][destination] = 999;
                }
            }
        }
        System.out.println("The Transitive Closure of the Graph");
        FloydWarshall floydwarshall = new FloydWarshall(numberOfVertices);
        floydwarshall.floydwarshall(adjacencyMatrix);
    }
}
