package com.rick.pattern_08_template.d04_jfame;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Rick
 * @Date: 2022/9/18 00:38
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame my = new MyFrame("Head First Design Patterns");
    }
}
