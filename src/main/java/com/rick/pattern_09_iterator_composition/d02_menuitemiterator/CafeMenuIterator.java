package com.rick.pattern_09_iterator_composition.d02_menuitemiterator;

import com.rick.pattern_09_iterator_composition.d01_menuitem.MenuItem;

import java.util.Iterator;
import java.util.Map;

/**
 * @Author: Rick
 * @Date: 2022/9/21 16:57
 */
public class CafeMenuIterator implements Iterable{

    Map<String, MenuItem> items;
    int position = 0;

    public CafeMenuIterator(Map<String, MenuItem> items) {
        this.items = items;
    }

    @Override
    public Iterator iterator() {
        return items.values().iterator();
    }
}
