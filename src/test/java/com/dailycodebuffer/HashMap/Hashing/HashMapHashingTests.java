/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailycodebuffer.HashMap.Hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Andy_
 */
public class HashMapHashingTests {

    private HashMap hash;
    private HashMap.Node nodo;
    private HashMap.Node nodo2;
    private HashMap.LinkedList lista;
    private HashMapLinearProbing linearhash;

    @BeforeEach
    void init() {
        hash = new HashMap(5);
        nodo = new HashMap.Node(3);
        nodo2 = new HashMap.Node(4);
        lista = new HashMap.LinkedList();
        linearhash = new HashMapLinearProbing(3);
    }

    @Test
    public void hashingHashMap() {
        hash.insertHash(5);
        hash.insertHash(6);
        Assertions.assertEquals(1, hash.hashing(6));
    }

    @Test
    public void deleteHashMap() {
        //
        hash.insertHash(5);
        hash.insertHash(6);
        hash.deleteHash(6);
        hash.displayHashtable();
    }

    @Test
    public void nextNodo() {
        nodo.setNext(nodo2);
        Assertions.assertEquals(nodo2, nodo.getNext());
    }

    @Test
    public void findKeyList() {
        lista.insert(1);
        lista.insert(2);
        lista.insert(3);
        Assertions.assertEquals(nodo.getKey(), lista.findKey(3).getKey());
        Assertions.assertEquals(null, lista.findKey(7));
    }

    @Test
    public void deleteNodeList() {
        lista.delete(0);
        lista.insert(1);
        lista.delete(1);
        Assertions.assertTrue(lista.isEmpty());
    }

    @Test
    public void hashingHashMapLinearProbing() {
        linearhash.displayHashtable();
        linearhash.insertHash(6);
        Assertions.assertEquals(0, linearhash.hashing(6));
        linearhash.insertHash(5);
        linearhash.insertHash(4);
        linearhash.insertHash(30);
        linearhash.insertHash(3000);
        linearhash.insertHash(30000);
        linearhash.insertHash(300000);
        linearhash.insertHash(307);
        linearhash.insertHash(370);
        linearhash.insertHash(3777);
        linearhash.insertHash(3070);
        linearhash.insertHash(37007);
        linearhash.displayHashtable();
        linearhash.deleteHash(30);
        linearhash.deleteHash(181818);
    }

    @Test
    public void emptyHashMapLinearProbing() {
        Assertions.assertTrue(linearhash.isEmpty());
        linearhash.deleteHash(0);
    }

    @Test
    public void loadFactorHashMapLinearProbing() {
        linearhash.insertHash(5);
        linearhash.insertHash(4);
        linearhash.checkLoadFactor();
        linearhash.insertHash(3);
        linearhash.checkLoadFactor();
        //
    }

    @Test
    public void findHashMapLinearProbing() {
        Assertions.assertEquals(-1, linearhash.findHash(3));
        linearhash.insertHash(5);
        linearhash.insertHash(4);
        linearhash.insertHash(3);
        Assertions.assertEquals(0, linearhash.findHash(3));
    }

}
