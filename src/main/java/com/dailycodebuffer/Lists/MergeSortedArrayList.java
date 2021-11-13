package com.dailycodebuffer.Lists;

import java.util.ArrayList;
import java.util.List;

/** @author https://github.com/shellhub */
public class MergeSortedArrayList {
  /**
   * merge two sorted ArrayList
   *
   * @param listA the first list to merge
   * @param listB the second list to merge
   * @param listC the result list after merging
   */
  public static void merge(List<Integer> listA, List<Integer> listB, List<Integer> listC) {
    int pa = 0; /* the index of listA */
    int pb = 0; /* the index of listB */

    while (pa < listA.size() && pb < listB.size()) {
      if (listA.get(pa) <= listB.get(pb)) {
        listC.add(listA.get(pa++));
      } else {
        listC.add(listB.get(pb++));
      }
    }

    /* copy left element of listA to listC */
    while (pa < listA.size()) {
      listC.add(listA.get(pa++));
    }

    /* copy left element of listB to listC */
    while (pb < listB.size()) {
      listC.add(listB.get(pb++));
    }
  }
}
