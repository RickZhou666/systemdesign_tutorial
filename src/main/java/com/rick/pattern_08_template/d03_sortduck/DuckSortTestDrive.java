package com.rick.pattern_08_template.d03_sortduck;

import com.rick.pattern_08_template.d05_abstractlist.MyStringList;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Rick
 * @Date: 2022/9/18 00:16
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2),
                new Duck("Rick", 15)};

        String[] ducks2 = {"Mallard Duck", "Rubber Duck", "Redhead Duck", "Decoy Duck"};
        MyStringList duckList = new MyStringList(ducks2);
        List ducksSubList = duckList.subList(2, 3);
        System.out.println(ducksSubList);



        // System.out.println("Before sorting:");
        // display(ducks);


        // 模版方法
        Arrays.sort(ducks);
        // System.out.println("\nAfter sorting");
        // display(ducks);


        int a = 15;
        // https://www.geeksforgeeks.org/assertions-in-java/
        assert a > 20 : "Underweight";
        System.out.println("Value is " + a);
    }

    private static void display(Duck[] ducks) {
        int i = 1;
        for (Duck duck: ducks){
            System.out.println(duck);
        }
    }
}
