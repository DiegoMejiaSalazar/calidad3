package com.dailycodebuffer.Trees;

/**
 * Trie Data structure implementation without any libraries
 *
 * @author Dheeraj Kumar Barnwal (https://github.com/dheeraj92)
 */
import java.util.Scanner;

public class TrieImp {

  public class TrieNode {
    TrieNode[] child;
    boolean end;

    public TrieNode() {
      child = new TrieNode[26];
      end = false;
    }
  }

  private final TrieNode root;

  public TrieImp() {
    root = new TrieNode();
  }

  public void insert(String word) {
    TrieNode currentNode = root;
    for (int i = 0; i < word.length(); i++) {
      TrieNode node = currentNode.child[word.charAt(i) - 'a'];
      if (node == null) {
        node = new TrieNode();
        currentNode.child[word.charAt(i) - 'a'] = node;
      }
      currentNode = node;
    }
    currentNode.end = true;
  }

  public boolean search(String word) {
    TrieNode currentNode = root;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      TrieNode node = currentNode.child[ch - 'a'];
      if (node == null) {
        return false;
      }
      currentNode = node;
    }
    return currentNode.end;
  }

  public boolean delete(String word) {
    TrieNode currentNode = root;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      TrieNode node = currentNode.child[ch - 'a'];
      if (node == null) {
        return false;
      }
      currentNode = node;
    }
    if (currentNode.end == true) {
      currentNode.end = false;
      return true;
    }
    return false;
  }

  public static void sop(String print) {
    System.out.println(print);
  }

  /** Regex to check if word contains only a-z character */
  public static boolean isValid(String word) {
    return word.matches("^[a-z]+$");
  }
}
