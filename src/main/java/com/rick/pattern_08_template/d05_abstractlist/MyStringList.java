package com.rick.pattern_08_template.d05_abstractlist;

import java.util.AbstractList;

/**
 * @Author: Rick
 * @Date: 2022/9/18 00:42
 */
public class MyStringList extends AbstractList<String> {
    private String[] myList;

    public MyStringList(String[] myList) {
        this.myList = myList;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }
}
