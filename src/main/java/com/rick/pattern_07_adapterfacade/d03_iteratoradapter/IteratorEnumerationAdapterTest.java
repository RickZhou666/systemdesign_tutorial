package com.rick.pattern_07_adapterfacade.d03_iteratoradapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @Author: Rick
 * @Date: 2022/9/14 22:08
 */
public class IteratorEnumerationAdapterTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Iterator iterator = list.iterator();
        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(iterator);

        while (iteratorEnumeration.hasMoreElements()){
            System.out.println(iteratorEnumeration.nextElement());
        }
    }
}
