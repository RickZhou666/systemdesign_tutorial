package com.rick.pattern_09_iterator_composition.d01_menuitem;

// import com.rick.pattern_09_iterator_composition.d02_menuitemiterator.Iterator;

import java.util.Iterator;

/**
 * @Author: Rick
 * @Date: 2022/9/21 10:50
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
