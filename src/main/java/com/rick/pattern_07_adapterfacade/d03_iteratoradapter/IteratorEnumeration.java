package com.rick.pattern_07_adapterfacade.d03_iteratoradapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Author: Rick
 * @Date: 2022/9/14 22:07
 */
public class IteratorEnumeration implements Enumeration<Object> {
    Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
