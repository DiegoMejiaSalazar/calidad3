/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailycodebuffer.DisjointSets;

import com.dailycodebuffer.DynamicArray.DynamicArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *
 * @author Andy_
 */
public class DisjointSetTests {
    
    private DisjointSets<String> departments;
    private Node<String> nodo,nodo2,nodo3;
    
     @BeforeEach
    void init(){
        departments = new DisjointSets<>();
        nodo = new Node<>("Dato");
        nodo2 = new Node<>("Datoz");
        nodo3 = new Node<>("Datos");
    }
    @Test
    public void makeSet(){
       // Assertions.assertEquals(nodo3.,departments.MakeSet("Datos"));
    }
    @Test
    public void unionSet(){
       Assertions.assertEquals(nodo.parent,departments.FindSet(nodo));
       Assertions.assertEquals(this, this);
        departments.UnionSet(nodo, nodo2);
        nodo.rank= 3;
        nodo2.rank= 2;
        departments.UnionSet(nodo, nodo3);
       Assertions.assertTrue(nodo3.parent==nodo.parent);
        nodo.rank= 1;
        nodo2.rank= 3;
        departments.UnionSet(nodo, nodo3);
       Assertions.assertTrue(nodo.parent==nodo3.parent);
       
       
    }
}

