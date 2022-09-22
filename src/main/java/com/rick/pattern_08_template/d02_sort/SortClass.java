package com.rick.pattern_08_template.d02_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Rick
 * @Date: 2022/9/17 23:40
 */
public class SortClass {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        // Collections.sort(arrayList);
        //
        Integer[] disorderArray = new Integer[]{5, 4, 3, 2, 1, 3, 5, 1};

        Arrays.sort(disorderArray);
        // insertionSort(disorderArray);
        System.out.println(Arrays.toString(disorderArray));






        // Integer a = 3;
        // Integer b = 2;
        // (x < y) ? -1 : ((x == y) ? 0 : 1);
        // System.out.println(a.compareTo(b));
        // a > b    ==>  1
        // a < b    ==> -1
        // a == b   ==>  0

    }


    // insertion sort
    // 之前的一定是排序好了的
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                swap(arr, j - 1, j);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
