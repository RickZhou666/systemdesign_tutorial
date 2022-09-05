package com.rick.pattern_02_observer.d03_swing_observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Rick
 * @Date: 2022/9/5 23:02
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }


    // after lambda
    public void go() {
        frame = new JFrame();

        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(event -> System.out.println("Dont' do it, you might regret it!"));
        jButton.addActionListener(event -> System.out.println("Come on, Do it!"));
    }

    // before lambda
    // public void go() {
    //     frame = new JFrame();
    //
    //     JButton jButton = new JButton("Should I do it?");
    //     jButton.addActionListener(new AngelListener());
    //     jButton.addActionListener(new DevilListener());
    //
    //     // 在这里设置frame属性
    // }
    //
    // class AngelListener implements ActionListener {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         System.out.println("Dont' do it, you might regret it!");
    //     }
    // }
    //
    // class DevilListener implements ActionListener {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         System.out.println("Come on, do it!");
    //     }
    // }
}
