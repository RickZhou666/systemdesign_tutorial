package com.rick.pattern_09_iterator_composition.d04_iterable;

import com.rick.pattern_09_iterator_composition.d01_menuitem.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Rick
 * @Date: 2022/9/21 16:05
 */
public class IterableTestDrive {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();

        Iterator<MenuItem> iterator = menuItems.iterator();
        while (iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }


        for (MenuItem item : menuItems){
            System.out.println(item.getName() + ", ");
            System.out.println(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }
}
