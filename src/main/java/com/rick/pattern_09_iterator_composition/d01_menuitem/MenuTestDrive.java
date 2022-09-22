package com.rick.pattern_09_iterator_composition.d01_menuitem;

import com.rick.pattern_09_iterator_composition.d05_cafe.CafeMenu;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Rick
 * @Date: 2022/9/21 10:42
 */
public class MenuTestDrive {
    public static void main(String[] args) {


        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        // Waitress waitress = new Waitress(pancakeHouseMenu);
        // waitress.printMenu();
        //
        //
        DinerMenu dinerMenu = new DinerMenu();
        // waitress = new Waitress(dinerMenu);
        // waitress.printMenu();

        CafeMenu cafeMenu = new CafeMenu();


        // 1st implementation
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();


        Iterator iterator = pancakeHouseMenu.createIterator();
        // iterator.remove();

        // 2nd implementation
        List<Menu> list = new ArrayList<>();
        list.add(pancakeHouseMenu);
        list.add(dinerMenu);
        list.add(cafeMenu);

        Waitress_version2 waitress_version2 = new Waitress_version2(list);
        waitress_version2.printMenu();

        // Enumeration
        // ArrayList
    }
}
