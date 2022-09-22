package com.rick.pattern_09_iterator_composition.d01_menuitem;

// import com.rick.pattern_09_iterator_composition.d02_menuitemiterator.Iterator;
import com.rick.pattern_09_iterator_composition.d02_menuitemiterator.PancakeHouseIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Rick
 * @Date: 2022/9/21 08:58
 */
public class PancakeHouseMenu implements Menu{
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }


    private void print(){
        menuItems.forEach(item -> System.out.println(item));
    }
    public Iterator createIterator() {
        return menuItems.iterator();
        // return new PancakeHouseIterator(menuItems);
    }

    // public List<MenuItem> getMenuItems() {
    //     return menuItems;
    // }
}
