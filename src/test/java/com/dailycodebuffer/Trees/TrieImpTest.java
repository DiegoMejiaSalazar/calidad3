package com.dailycodebuffer.Trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrieImpTest {

    private TrieImp trieImp;

    @BeforeEach
    void init() {
        trieImp = new TrieImp();
    }

    @Test
    public void insertValidAndSearchTest(){
        trieImp.insert("alejandra");
        trieImp.insert("carlos");
        trieImp.insert("alex");
        trieImp.insert("diego");
        Assertions.assertTrue(trieImp.search("alejandra"));
        Assertions.assertFalse(trieImp.search("saul"));
        Assertions.assertFalse(TrieImp.isValid("Alejandra"));

    }
    @Test
    public void deleteTest(){
        trieImp.insert("alejandra");
        trieImp.insert("carlos");
        trieImp.insert("alex");
        trieImp.insert("diego");
        Assertions.assertTrue(trieImp.delete("alejandra"));
        Assertions.assertFalse(trieImp.delete("saul"));
    }
}
