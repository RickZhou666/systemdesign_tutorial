package com.rick.pattern_09_iterator_composition.d01_menuitem;

import com.rick.pattern_09_iterator_composition.d02_menuitemiterator.DinerMenuIterator;

import java.util.Iterator;
// import com.rick.pattern_09_iterator_composition.d02_menuitemiterator.Iterator;


/**
 * @Author: Rick
 * @Date: 2022/9/21 09:04
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on while wheat",
                true,
                2.99);

        addItem("BLT",
                "Bacon with lettuce & tomato on while wheat",
                false,
                2.99);

        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29);

        addItem("Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false,
                3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu if full! Can't add item to menu");
        } else {
            menuItems[numberOfItems++] = item;
        }
    }

    // public MenuItem[] getMenuItems() {
    //     return menuItems;
    // }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
