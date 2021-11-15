package com.dailycodebuffer.Graphs;

import java.util.Scanner;

public class FloydWarshall {
  private int DistanceMatrix[][];
  private int numberofvertices; // number of vertices in the graph
  public static final int INFINITY = 999;

  public FloydWarshall(int numberofvertices) {
    DistanceMatrix =
        new int[numberofvertices + 1]
            [numberofvertices
                + 1]; // stores the value of distance from all the possible path form the source
    // vertex to destination vertex
    // The matrix is initialized with 0's by default
    this.numberofvertices = numberofvertices;
  }

  public void floydwarshall(
      int AdjacencyMatrix[][]) // calculates all the distances from source to destination vertex
      {
    for (int source = 1; source <= numberofvertices; source++) {
      for (int destination = 1; destination <= numberofvertices; destination++) {
        DistanceMatrix[source][destination] = AdjacencyMatrix[source][destination];
      }
    }
    for (int intermediate = 1; intermediate <= numberofvertices; intermediate++) {
      for (int source = 1; source <= numberofvertices; source++) {
        for (int destination = 1; destination <= numberofvertices; destination++) {
          if (DistanceMatrix[source][intermediate] + DistanceMatrix[intermediate][destination]
              < DistanceMatrix[source][destination])
          // if the new distance calculated is less then the earlier shortest
          // calculated distance it get replaced as new shortest distance
          {
            DistanceMatrix[source][destination] =
                DistanceMatrix[source][intermediate] + DistanceMatrix[intermediate][destination];
          }
        }
      }
    }
    for (int source = 1; source <= numberofvertices; source++) System.out.print("\t" + source);
    System.out.println();
    for (int source = 1; source <= numberofvertices; source++) {
      System.out.print(source + "\t");
      for (int destination = 1; destination <= numberofvertices; destination++) {
        System.out.print(DistanceMatrix[source][destination] + "\t");
      }
      System.out.println();
    }
  }
}
