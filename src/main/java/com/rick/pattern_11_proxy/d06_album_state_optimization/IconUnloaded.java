package com.rick.pattern_11_proxy.d06_album_state_optimization;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @Author: Rick
 * @Date: 2022/9/24 10:07
 */
public class IconUnloaded implements State {
    final URL imageURL;
    ImageProxy imageProxy;
    private ImageIcon imageIcon;

    public IconUnloaded(ImageProxy imageProxy, URL imageURL) {
        this.imageProxy = imageProxy;
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

    // synchronized 保护写
    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageProxy.setState(imageProxy.getIconLoaded());
        Thread retrievalThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        retrievalThread.start();


    }
}
