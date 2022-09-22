package com.rick.pattern_09_iterator_composition.d01_menuitem;

// import com.rick.pattern_09_iterator_composition.d02_menuitemiterator.Iterator;


import java.util.Iterator;

/**
 * @Author: Rick
 * @Date: 2022/9/21 09:10
 */
public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    // PancakeHouseMenu pancakeHouseMenu;
    // DinerMenu dinerMenu;


    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

        System.out.println("MENU\n---\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
    }


    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
        System.out.println("\n");
    }

    // public static void printMenuLegacy() {
    //     PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    //     List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
    //
    //     DinerMenu dinerMenu = new DinerMenu();
    //     MenuItem[] lunchItems = dinerMenu.getMenuItems();
    //
    //
    //     System.out.println("======= breakfast Items =======");
    //     for (int i = 0; i < breakfastItems.size(); i++) {
    //         MenuItem menuItem = breakfastItems.get(i);
    //         System.out.println(menuItem.getName() + " ");
    //         System.out.println(menuItem.getPrice() + " ");
    //         System.out.println(menuItem.getDescription() + " \n");
    //     }
    //
    //     System.out.println("\n======= lunch Items =======");
    //     for (int i = 0; i < lunchItems.length; i++) {
    //         MenuItem menuItem = lunchItems[i];
    //         System.out.println(menuItem.getName() + " ");
    //         System.out.println(menuItem.getPrice() + " ");
    //         System.out.println(menuItem.getDescription() + " \n");
    //         // item 6, the rest of 2 is null, throw NPE
    //     }
    // }
}
